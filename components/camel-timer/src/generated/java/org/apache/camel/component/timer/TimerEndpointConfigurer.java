/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.timer;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class TimerEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        TimerEndpoint target = (TimerEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "daemon": target.setDaemon(property(camelContext, boolean.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "fixedrate":
        case "fixedRate": target.setFixedRate(property(camelContext, boolean.class, value)); return true;
        case "includemetadata":
        case "includeMetadata": target.setIncludeMetadata(property(camelContext, boolean.class, value)); return true;
        case "pattern": target.setPattern(property(camelContext, java.lang.String.class, value)); return true;
        case "period": target.setPeriod(property(camelContext, long.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "time": target.setTime(property(camelContext, java.util.Date.class, value)); return true;
        case "timer": target.setTimer(property(camelContext, java.util.Timer.class, value)); return true;
        default: return false;
        }
    }

}
