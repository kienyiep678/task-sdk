package dc.icdc.mstaskplannersdk.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Import({TaskSdkConfig.class})
public @interface EnableTaskSdk {
}
