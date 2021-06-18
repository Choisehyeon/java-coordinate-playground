package locationcaculator;

import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Point {
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 24;
    private int x;
    private int y;

    public Point(int x, int y) {
        if((x < MIN_VALUE || x > MAX_VALUE) || (y < MIN_VALUE || y > MAX_VALUE)) {
            throw new IllegalArgumentException("다시 입력하세요.");
        }
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
