/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.robotframework;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class RobotFrameworkEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        RobotFrameworkEndpoint target = (RobotFrameworkEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowtemplatefromheader":
        case "allowTemplateFromHeader": target.getConfiguration().setAllowTemplateFromHeader(property(camelContext, boolean.class, value)); return true;
        case "argumentfile":
        case "argumentFile": target.getConfiguration().setArgumentFile(property(camelContext, java.io.File.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "combinedtagstats":
        case "combinedTagStats": target.getConfiguration().setCombinedTagStats(property(camelContext, java.lang.String.class, value)); return true;
        case "contentcache":
        case "contentCache": target.setContentCache(property(camelContext, boolean.class, value)); return true;
        case "criticaltags":
        case "criticalTags": target.getConfiguration().setCriticalTags(property(camelContext, java.lang.String.class, value)); return true;
        case "debugfile":
        case "debugFile": target.getConfiguration().setDebugFile(property(camelContext, java.io.File.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "document": target.getConfiguration().setDocument(property(camelContext, java.lang.String.class, value)); return true;
        case "dryrun": target.getConfiguration().setDryrun(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "excludes": target.getConfiguration().setExcludes(property(camelContext, java.lang.String.class, value)); return true;
        case "exitonfailure":
        case "exitOnFailure": target.getConfiguration().setExitOnFailure(property(camelContext, boolean.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "includes": target.getConfiguration().setIncludes(property(camelContext, java.lang.String.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "listener": target.getConfiguration().setListener(property(camelContext, java.lang.String.class, value)); return true;
        case "listeners": target.getConfiguration().setListeners(property(camelContext, java.lang.String.class, value)); return true;
        case "log": target.getConfiguration().setLog(property(camelContext, java.io.File.class, value)); return true;
        case "loglevel":
        case "logLevel": target.getConfiguration().setLogLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "logtitle":
        case "logTitle": target.getConfiguration().setLogTitle(property(camelContext, java.lang.String.class, value)); return true;
        case "metadata": target.getConfiguration().setMetadata(property(camelContext, java.lang.String.class, value)); return true;
        case "monitorcolors":
        case "monitorColors": target.getConfiguration().setMonitorColors(property(camelContext, java.lang.String.class, value)); return true;
        case "monitorwidth":
        case "monitorWidth": target.getConfiguration().setMonitorWidth(property(camelContext, java.lang.String.class, value)); return true;
        case "name": target.getConfiguration().setName(property(camelContext, java.lang.String.class, value)); return true;
        case "nostatusreturncode":
        case "noStatusReturnCode": target.getConfiguration().setNoStatusReturnCode(property(camelContext, boolean.class, value)); return true;
        case "noncriticaltags":
        case "nonCriticalTags": target.getConfiguration().setNonCriticalTags(property(camelContext, java.lang.String.class, value)); return true;
        case "output": target.getConfiguration().setOutput(property(camelContext, java.io.File.class, value)); return true;
        case "outputdirectory":
        case "outputDirectory": target.getConfiguration().setOutputDirectory(property(camelContext, java.io.File.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "randomize": target.getConfiguration().setRandomize(property(camelContext, java.lang.String.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "report": target.getConfiguration().setReport(property(camelContext, java.io.File.class, value)); return true;
        case "reportbackground":
        case "reportBackground": target.getConfiguration().setReportBackground(property(camelContext, java.lang.String.class, value)); return true;
        case "reporttitle":
        case "reportTitle": target.getConfiguration().setReportTitle(property(camelContext, java.lang.String.class, value)); return true;
        case "runemptysuite":
        case "runEmptySuite": target.getConfiguration().setRunEmptySuite(property(camelContext, boolean.class, value)); return true;
        case "runfailed":
        case "runFailed": target.getConfiguration().setRunFailed(property(camelContext, java.io.File.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "runmode":
        case "runMode": target.getConfiguration().setRunMode(property(camelContext, java.lang.String.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "skipteardownonexit":
        case "skipTeardownOnExit": target.getConfiguration().setSkipTeardownOnExit(property(camelContext, boolean.class, value)); return true;
        case "splitoutputs":
        case "splitOutputs": target.getConfiguration().setSplitOutputs(property(camelContext, java.lang.String.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "suitestatlevel":
        case "suiteStatLevel": target.getConfiguration().setSuiteStatLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "suites": target.getConfiguration().setSuites(property(camelContext, java.lang.String.class, value)); return true;
        case "summarytitle":
        case "summaryTitle": target.getConfiguration().setSummaryTitle(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tagdocs":
        case "tagDocs": target.getConfiguration().setTagDocs(property(camelContext, java.lang.String.class, value)); return true;
        case "tagstatexcludes":
        case "tagStatExcludes": target.getConfiguration().setTagStatExcludes(property(camelContext, java.lang.String.class, value)); return true;
        case "tagstatincludes":
        case "tagStatIncludes": target.getConfiguration().setTagStatIncludes(property(camelContext, java.lang.String.class, value)); return true;
        case "tagstatlinks":
        case "tagStatLinks": target.getConfiguration().setTagStatLinks(property(camelContext, java.lang.String.class, value)); return true;
        case "tags": target.getConfiguration().setTags(property(camelContext, java.lang.String.class, value)); return true;
        case "tests": target.getConfiguration().setTests(property(camelContext, java.lang.String.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "timestampoutputs":
        case "timestampOutputs": target.getConfiguration().setTimestampOutputs(property(camelContext, boolean.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "variablefiles":
        case "variableFiles": target.getConfiguration().setVariableFiles(property(camelContext, java.lang.String.class, value)); return true;
        case "variables": target.getConfiguration().setVariables(property(camelContext, java.lang.String.class, value)); return true;
        case "warnonskippedfiles":
        case "warnOnSkippedFiles": target.getConfiguration().setWarnOnSkippedFiles(property(camelContext, boolean.class, value)); return true;
        case "xunitfile":
        case "xunitFile": target.getConfiguration().setXunitFile(property(camelContext, java.io.File.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("allowTemplateFromHeader", boolean.class);
        answer.put("argumentFile", java.io.File.class);
        answer.put("backoffErrorThreshold", int.class);
        answer.put("backoffIdleThreshold", int.class);
        answer.put("backoffMultiplier", int.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("combinedTagStats", java.lang.String.class);
        answer.put("contentCache", boolean.class);
        answer.put("criticalTags", java.lang.String.class);
        answer.put("debugFile", java.io.File.class);
        answer.put("delay", long.class);
        answer.put("document", java.lang.String.class);
        answer.put("dryrun", boolean.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("excludes", java.lang.String.class);
        answer.put("exitOnFailure", boolean.class);
        answer.put("greedy", boolean.class);
        answer.put("includes", java.lang.String.class);
        answer.put("initialDelay", long.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("listener", java.lang.String.class);
        answer.put("listeners", java.lang.String.class);
        answer.put("log", java.io.File.class);
        answer.put("logLevel", java.lang.String.class);
        answer.put("logTitle", java.lang.String.class);
        answer.put("metadata", java.lang.String.class);
        answer.put("monitorColors", java.lang.String.class);
        answer.put("monitorWidth", java.lang.String.class);
        answer.put("name", java.lang.String.class);
        answer.put("noStatusReturnCode", boolean.class);
        answer.put("nonCriticalTags", java.lang.String.class);
        answer.put("output", java.io.File.class);
        answer.put("outputDirectory", java.io.File.class);
        answer.put("pollStrategy", org.apache.camel.spi.PollingConsumerPollStrategy.class);
        answer.put("randomize", java.lang.String.class);
        answer.put("repeatCount", long.class);
        answer.put("report", java.io.File.class);
        answer.put("reportBackground", java.lang.String.class);
        answer.put("reportTitle", java.lang.String.class);
        answer.put("runEmptySuite", boolean.class);
        answer.put("runFailed", java.io.File.class);
        answer.put("runLoggingLevel", org.apache.camel.LoggingLevel.class);
        answer.put("runMode", java.lang.String.class);
        answer.put("scheduledExecutorService", java.util.concurrent.ScheduledExecutorService.class);
        answer.put("scheduler", java.lang.String.class);
        answer.put("schedulerProperties", java.util.Map.class);
        answer.put("sendEmptyMessageWhenIdle", boolean.class);
        answer.put("skipTeardownOnExit", boolean.class);
        answer.put("splitOutputs", java.lang.String.class);
        answer.put("startScheduler", boolean.class);
        answer.put("suiteStatLevel", java.lang.String.class);
        answer.put("suites", java.lang.String.class);
        answer.put("summaryTitle", java.lang.String.class);
        answer.put("synchronous", boolean.class);
        answer.put("tagDocs", java.lang.String.class);
        answer.put("tagStatExcludes", java.lang.String.class);
        answer.put("tagStatIncludes", java.lang.String.class);
        answer.put("tagStatLinks", java.lang.String.class);
        answer.put("tags", java.lang.String.class);
        answer.put("tests", java.lang.String.class);
        answer.put("timeUnit", java.util.concurrent.TimeUnit.class);
        answer.put("timestampOutputs", boolean.class);
        answer.put("useFixedDelay", boolean.class);
        answer.put("variableFiles", java.lang.String.class);
        answer.put("variables", java.lang.String.class);
        answer.put("warnOnSkippedFiles", boolean.class);
        answer.put("xunitFile", java.io.File.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        RobotFrameworkEndpoint target = (RobotFrameworkEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowtemplatefromheader":
        case "allowTemplateFromHeader": return target.getConfiguration().isAllowTemplateFromHeader();
        case "argumentfile":
        case "argumentFile": return target.getConfiguration().getArgumentFile();
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "combinedtagstats":
        case "combinedTagStats": return target.getConfiguration().getCombinedTagStats();
        case "contentcache":
        case "contentCache": return target.isContentCache();
        case "criticaltags":
        case "criticalTags": return target.getConfiguration().getCriticalTags();
        case "debugfile":
        case "debugFile": return target.getConfiguration().getDebugFile();
        case "delay": return target.getDelay();
        case "document": return target.getConfiguration().getDocument();
        case "dryrun": return target.getConfiguration().isDryrun();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "excludes": return target.getConfiguration().getExcludes();
        case "exitonfailure":
        case "exitOnFailure": return target.getConfiguration().isExitOnFailure();
        case "greedy": return target.isGreedy();
        case "includes": return target.getConfiguration().getIncludes();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "listener": return target.getConfiguration().getListener();
        case "listeners": return target.getConfiguration().getListeners();
        case "log": return target.getConfiguration().getLog();
        case "loglevel":
        case "logLevel": return target.getConfiguration().getLogLevel();
        case "logtitle":
        case "logTitle": return target.getConfiguration().getLogTitle();
        case "metadata": return target.getConfiguration().getMetadata();
        case "monitorcolors":
        case "monitorColors": return target.getConfiguration().getMonitorColors();
        case "monitorwidth":
        case "monitorWidth": return target.getConfiguration().getMonitorWidth();
        case "name": return target.getConfiguration().getName();
        case "nostatusreturncode":
        case "noStatusReturnCode": return target.getConfiguration().isNoStatusReturnCode();
        case "noncriticaltags":
        case "nonCriticalTags": return target.getConfiguration().getNonCriticalTags();
        case "output": return target.getConfiguration().getOutput();
        case "outputdirectory":
        case "outputDirectory": return target.getConfiguration().getOutputDirectory();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "randomize": return target.getConfiguration().getRandomize();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "report": return target.getConfiguration().getReport();
        case "reportbackground":
        case "reportBackground": return target.getConfiguration().getReportBackground();
        case "reporttitle":
        case "reportTitle": return target.getConfiguration().getReportTitle();
        case "runemptysuite":
        case "runEmptySuite": return target.getConfiguration().isRunEmptySuite();
        case "runfailed":
        case "runFailed": return target.getConfiguration().getRunFailed();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "runmode":
        case "runMode": return target.getConfiguration().getRunMode();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "skipteardownonexit":
        case "skipTeardownOnExit": return target.getConfiguration().isSkipTeardownOnExit();
        case "splitoutputs":
        case "splitOutputs": return target.getConfiguration().getSplitOutputs();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "suitestatlevel":
        case "suiteStatLevel": return target.getConfiguration().getSuiteStatLevel();
        case "suites": return target.getConfiguration().getSuites();
        case "summarytitle":
        case "summaryTitle": return target.getConfiguration().getSummaryTitle();
        case "synchronous": return target.isSynchronous();
        case "tagdocs":
        case "tagDocs": return target.getConfiguration().getTagDocs();
        case "tagstatexcludes":
        case "tagStatExcludes": return target.getConfiguration().getTagStatExcludes();
        case "tagstatincludes":
        case "tagStatIncludes": return target.getConfiguration().getTagStatIncludes();
        case "tagstatlinks":
        case "tagStatLinks": return target.getConfiguration().getTagStatLinks();
        case "tags": return target.getConfiguration().getTags();
        case "tests": return target.getConfiguration().getTests();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "timestampoutputs":
        case "timestampOutputs": return target.getConfiguration().isTimestampOutputs();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        case "variablefiles":
        case "variableFiles": return target.getConfiguration().getVariableFiles();
        case "variables": return target.getConfiguration().getVariables();
        case "warnonskippedfiles":
        case "warnOnSkippedFiles": return target.getConfiguration().isWarnOnSkippedFiles();
        case "xunitfile":
        case "xunitFile": return target.getConfiguration().getXunitFile();
        default: return null;
        }
    }
}

