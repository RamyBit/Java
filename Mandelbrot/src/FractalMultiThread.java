import java.awt.*;
import java.awt.event.HierarchyBoundsAdapter;
import java.awt.image.*;
import javax.swing.*;
public class FractalMultiThread {
    private static final int MAX_ITER = 5000;
    private static final int WIDTH = 800;
    private static final int HEIGHT = 800;
    private static final int THREAD_COUNT = 4;
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(WIDTH,HEIGHT, BufferedImage.TYPE_INT_RGB);
        JFrame frame = new JFrame("Mandelbrot Set");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
        frame.add(new JLabel(new ImageIcon(image)));
        int[] pixels =((DataBufferInt) image.getRaster().getDataBuffer()).getData();
        Thread[] threads = new Thread[THREAD_COUNT];
        for (int i = 0; i < THREAD_COUNT ; i++) {
            final int threadIndex = i;
            threads[i] = new Thread(new Runnable() {

                public void run() {
                    int startIndex = threadIndex * WIDTH * HEIGHT / THREAD_COUNT;
                    int endIndex = (threadIndex + 1) * WIDTH * HEIGHT / THREAD_COUNT;
                    for (int i = startIndex; i < endIndex ; i++) {
                        int x = i % WIDTH;
                        int y = i / WIDTH;
                        double zx = 0;
                        double zy = 0;
                        double cx = (x -WIDTH / 2.0) * 4.0 / WIDTH;
                        double cy = (y -HEIGHT / 2.0) * 4.0 / WIDTH;
                        int iter = 0;
                        while (zx * zx + zy * zy < 4 && iter < MAX_ITER){
                            double tmp = zx * zx - zy * zy + cx;
                            zy = 2.0 * zx * zy + cy;
                            zx = tmp;
                            iter++;
                        }
                        int color = iter | (iter << 8);
                        pixels[y * WIDTH + x] = color;
                    }
                }
            });
            threads[i].start();
        }
        for (int i = 0; i < THREAD_COUNT; i++) {
            try {
                threads[i].join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        frame.repaint();
    }
}