package com.lenovo.dcg.hwaas.xccapiemulator.controllers.power.systems_container.metrics_container;

import com.lenovo.dcg.hwaas.xccapiemulator.services.Generate_Power_Metrics;
import org.json.JSONException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Redfish_V1_Systems_1_OEM_Lenovo_Metrics_PowerSupplyInputPower2_Controller {
    @RequestMapping(path = "/redfish/v1/Systems/1/Oem/Lenovo/Metrics/PowerSupplyInputPower2", produces = MediaType.APPLICATION_JSON_VALUE)
    public String PowerSupplyInputPower2(Generate_Power_Metrics generate) throws JSONException {
        return generate.generatePowerMeteringData(13, 12, 120, false, "PowerSupplyInputPower2");
    }
}
