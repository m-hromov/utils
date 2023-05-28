import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (org.apache.commons.lang3.StringUtils.isBlank(str) ||
            !NumberUtils.isNumber(str)) {
            throw new RuntimeException("Invalid");
        }
        return NumberUtils.createNumber(str).longValue() > 0;
    }
}
