import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


/**
 * Created by cccce on 02/13/2017.
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface RetryCountIfFailed {

        // Specify how many times you want to
        // retry the test if failed.
        // Default value of retry count is 0
        int value() default 0;

}
