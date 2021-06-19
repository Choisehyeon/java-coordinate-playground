package coordinate;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FigureFactory {

    static Figure getInstance(List<Point> points) {
        return Size.findSize(points);
    }
}
