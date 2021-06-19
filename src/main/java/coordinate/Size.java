package coordinate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum Size implements FigureCreator {

    Two(2) {
        @Override
        public Figure create(List<Point> points) {
            return new Line(points);
        }
    },
    Three(3) {
        @Override
        public Figure create(List<Point> points) {
            return new Triangle(points);
        }
    },
    Four(4) {
        @Override
        public Figure create(List<Point> points) {
            return new Rectangle(points);
        }
    };

    private final int size;

    Size(int size) {
        this.size = size;
    }

    private static final Map<Integer, Size> sizeHashMap = new HashMap<Integer, Size>(); //map collection 사용

    static {
        for (Size size : values()) {
            sizeHashMap.put(size.size, size);
        }
    }

    public static Figure findSize(List<Point> points) {
        if (sizeHashMap.containsKey(points.size()))
            return sizeHashMap.get(points.size()).create(points);
        throw new IllegalArgumentException("유효하지 않은 도형입니다.");
    }

}
