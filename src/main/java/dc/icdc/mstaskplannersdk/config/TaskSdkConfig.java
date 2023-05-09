package dc.icdc.mstaskplannersdk.config;

import dc.icdc.lib.hi.config.EnableHostIntegrationLib;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"dc.idc.mstechnicalprofilesdk"})
@EnableHostIntegrationLib
public class TaskSdkConfig {
}
