/**
 * 
 */
package com.labs.kaddy.flow.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gaurav
 *
 */
@RestController
public class FallBackMethodController {

    @GetMapping("/workflowServiceFallBack")
    public String userServiceFallBackMethod() {
        return "Workflow Service is taking longer than Expected." +
                " Please try again later";
    }

}
