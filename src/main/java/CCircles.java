/*
    https://www.codechef.com/problems/CCIRCLES
 */

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CCircles {
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }
    }

    static class Point {
        private long x;
        private long y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }

        public long getX() {
            return x;
        }

        public long getY() {
            return y;
        }
    }

    static class Circle {
        private Point center;
        private int r;

        public Circle(Point center, int r) {
            this.center = center;
            this.r = r;
        }

        public Point getCenter() {
            return center;
        }

        public int getR() {
            return r;
        }
    }

    private static double distance(Point p1, Point p2) {
        return Math.sqrt(
                (p2.getX() - p1.getX()) * (p2.getX() - p1.getX()) +
                        (p2.getY() - p1.getY()) * (p2.getY() - p1.getY()));
    }

    public static List<Integer> solve(List<Circle> circles, List<Integer> queries) {
        long[] differenceArray = new long[1000000];
        for (int i = 0; i < circles.size() - 1; i++) {
            for (int j = i + 1; j < circles.size(); j++) {
                Circle a = circles.get(i);
                Circle b = circles.get(j);
                long min, max;
                long r1 = Math.min(a.getR(), b.getR());
                long r2 = Math.max(a.getR(), b.getR());
                double distanceBetweenCenters = distance(a.getCenter(), b.getCenter());
                if (distanceBetweenCenters >= r1 + r2) {
                    min = (long)Math.ceil(distanceBetweenCenters - r1 - r2);
                    max = (long)Math.floor(distanceBetweenCenters + r1 + r2);
                } else {
                    if (r2 >= distanceBetweenCenters + r1) {
                        min = (long)Math.ceil(r2 - distanceBetweenCenters - r1);
                        max = (long)Math.floor(r2 + distanceBetweenCenters + r1);
                    } else {
                        min = 0;
                        max = (long)Math.floor(r1 + r2 + distanceBetweenCenters);
                    }
                }
                differenceArray[(int)min] += 1;
                differenceArray[(int)(max+1)] -= 1;
            }
        }
        for(int i = 1; i < 1000000; i++)
        {
            differenceArray[i] = differenceArray[i-1] + differenceArray[i];
        }
        List<Integer> result = new LinkedList<>();
        queries.forEach(query -> {
            result.add((int)differenceArray[query]);
        });
        return result;
    }

    public static void main(String[] args ) throws IOException {
        Reader s = new Reader();
        int n = s.nextInt();
        int q = s.nextInt();
        List<Circle> circles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            circles.add(new Circle(new Point(s.nextInt(), s.nextInt()), s.nextInt()));
        }
        List<Integer> queries = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            queries.add(s.nextInt());
        }
        List<Integer> result = solve(circles, queries);
        result.forEach(res -> {
            System.out.println(res);
        });
    }

}
