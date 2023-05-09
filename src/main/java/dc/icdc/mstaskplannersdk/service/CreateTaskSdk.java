package dc.icdc.mstaskplannersdk.service;

import dc.icdc.lib.common.model.dto.CommonResponse;
import dc.icdc.lib.hi.helper.HostIntegrationHelper;
import dc.icdc.lib.hi.model.dto.HostIntegrationDTO;
import dc.icdc.mstaskplannermodel.dto.GetProjectDetailsResponse;
import dc.icdc.mstaskplannermodel.dto.SearchProjectRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.RequestBody;

public class CreateTaskSdk {

    @Autowired
    private HostIntegrationHelper hostIntegrationHelper;

    public CommonResponse<SearchProjectRequest> createNewTechnicalProfile(@RequestBody(required = false) SearchProjectRequest request){
        HostIntegrationDTO<SearchProjectRequest, CommonResponse<SearchProjectRequest>> integrationDTO =
                HostIntegrationDTO.<SearchProjectRequest,  CommonResponse<SearchProjectRequest>> builder()
                        .serviceName("search-task-planner")
                        .reference(new ParameterizedTypeReference<CommonResponse<SearchProjectRequest>>(){})
                        .requestBody(request)
                        .build();

        return hostIntegrationHelper.integrate(integrationDTO);
    }

//    public CommonResponse<HolidayTempDTO> addHolidayRequest(@RequestBody @Valid HolidayTempDTO holidayTempDTO){
//        HostIntegrationDTO<HolidayTempDTO,CommonResponse<HolidayTempDTO>> integrationDTO =
//                HostIntegrationDTO.<HolidayTempDTO,CommonResponse<HolidayTempDTO>>builder()
//                        .serviceName("add-holiday")
//                        .requestBody(holidayTempDTO)
//                        .outputParameterizedTypeReference(new ParameterizedTypeReference<CommonResponse<HolidayTempDTO>>(){})
//                        .build();
//        return hostIntegrationHelper.integrate(integrationDTO);
//    }

}
