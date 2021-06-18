package locationcaculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class LocationValidTest {

    @Test
    void 정상값_Point_Test() {
        assertThat(new Point(0,0));
        assertThat(new Point(24,24));
    }

    @Test
    void 예외_Point_Test() {
        assertThatThrownBy(() -> {
            new Point(0,25);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("다시 입력하세요.");

        assertThatThrownBy(() -> {
            new Point(-1,24);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("다시 입력하세요.");


        assertThatThrownBy(() -> {
            new Point(-1,25);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("다시 입력하세요.");
    }

    @Test
    void 거리_check() {

        Straight line = new Straight(new Point(10,10), new Point(14,15));
        assertThat(line.length()).isEqualTo(6.403, offset(0.00099));
    }

    @Test
    void 사각형넓이_check() {

        Shape square = new Square(new Point(10,10), new Point(22,10), new Point(22,18), new Point(10,18));
        assertThat(square.area()).isEqualTo(96);
    }

    @Test
    void 삼각형넓이_check() {
        Shape triangle = new Triangle(new Point(10,10), new Point(14,15), new Point(20,8));
        assertThat(triangle.area()).isEqualTo(29.0, offset(0.09999));
    }

}
