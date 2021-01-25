package Point;

import com.sun.org.apache.xpath.internal.operations.Equals;

import javax.annotation.Generated;
import java.util.Objects;

public class Point {
    private  int x;
    private  int y;
   //自动生成的代码 alt+insert
    public Point(int x, int y) {  //构造结构
        this.x = x;
        this.y = y;
    }

    public int getX() {   //获取x和y的获取和返回值
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
