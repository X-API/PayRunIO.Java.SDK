package io.payrun.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayslipReport extends HashMap<String, Object> {

    public List<Map<String, Object>> getPayRuns() {
        return (List<Map<String, Object>>) get("PayRun");
    }

}
