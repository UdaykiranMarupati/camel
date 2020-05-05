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
public class RobotFrameworkComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.robotframework.RobotFrameworkCamelConfiguration getOrCreateConfiguration(RobotFrameworkComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.robotframework.RobotFrameworkCamelConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        RobotFrameworkComponent target = (RobotFrameworkComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowtemplatefromheader":
        case "allowTemplateFromHeader": getOrCreateConfiguration(target).setAllowTemplateFromHeader(property(camelContext, boolean.class, value)); return true;
        case "argumentfile":
        case "argumentFile": getOrCreateConfiguration(target).setArgumentFile(property(camelContext, java.io.File.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "combinedtagstats":
        case "combinedTagStats": getOrCreateConfiguration(target).setCombinedTagStats(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.robotframework.RobotFrameworkCamelConfiguration.class, value)); return true;
        case "criticaltags":
        case "criticalTags": getOrCreateConfiguration(target).setCriticalTags(property(camelContext, java.lang.String.class, value)); return true;
        case "debugfile":
        case "debugFile": getOrCreateConfiguration(target).setDebugFile(property(camelContext, java.io.File.class, value)); return true;
        case "document": getOrCreateConfiguration(target).setDocument(property(camelContext, java.lang.String.class, value)); return true;
        case "dryrun": getOrCreateConfiguration(target).setDryrun(property(camelContext, boolean.class, value)); return true;
        case "excludes": getOrCreateConfiguration(target).setExcludes(property(camelContext, java.lang.String.class, value)); return true;
        case "exitonfailure":
        case "exitOnFailure": getOrCreateConfiguration(target).setExitOnFailure(property(camelContext, boolean.class, value)); return true;
        case "includes": getOrCreateConfiguration(target).setIncludes(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "listener": getOrCreateConfiguration(target).setListener(property(camelContext, java.lang.String.class, value)); return true;
        case "listeners": getOrCreateConfiguration(target).setListeners(property(camelContext, java.lang.String.class, value)); return true;
        case "log": getOrCreateConfiguration(target).setLog(property(camelContext, java.io.File.class, value)); return true;
        case "loglevel":
        case "logLevel": getOrCreateConfiguration(target).setLogLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "logtitle":
        case "logTitle": getOrCreateConfiguration(target).setLogTitle(property(camelContext, java.lang.String.class, value)); return true;
        case "metadata": getOrCreateConfiguration(target).setMetadata(property(camelContext, java.lang.String.class, value)); return true;
        case "monitorcolors":
        case "monitorColors": getOrCreateConfiguration(target).setMonitorColors(property(camelContext, java.lang.String.class, value)); return true;
        case "monitorwidth":
        case "monitorWidth": getOrCreateConfiguration(target).setMonitorWidth(property(camelContext, java.lang.String.class, value)); return true;
        case "name": getOrCreateConfiguration(target).setName(property(camelContext, java.lang.String.class, value)); return true;
        case "nostatusreturncode":
        case "noStatusReturnCode": getOrCreateConfiguration(target).setNoStatusReturnCode(property(camelContext, boolean.class, value)); return true;
        case "noncriticaltags":
        case "nonCriticalTags": getOrCreateConfiguration(target).setNonCriticalTags(property(camelContext, java.lang.String.class, value)); return true;
        case "output": getOrCreateConfiguration(target).setOutput(property(camelContext, java.io.File.class, value)); return true;
        case "outputdirectory":
        case "outputDirectory": getOrCreateConfiguration(target).setOutputDirectory(property(camelContext, java.io.File.class, value)); return true;
        case "randomize": getOrCreateConfiguration(target).setRandomize(property(camelContext, java.lang.String.class, value)); return true;
        case "report": getOrCreateConfiguration(target).setReport(property(camelContext, java.io.File.class, value)); return true;
        case "reportbackground":
        case "reportBackground": getOrCreateConfiguration(target).setReportBackground(property(camelContext, java.lang.String.class, value)); return true;
        case "reporttitle":
        case "reportTitle": getOrCreateConfiguration(target).setReportTitle(property(camelContext, java.lang.String.class, value)); return true;
        case "runemptysuite":
        case "runEmptySuite": getOrCreateConfiguration(target).setRunEmptySuite(property(camelContext, boolean.class, value)); return true;
        case "runfailed":
        case "runFailed": getOrCreateConfiguration(target).setRunFailed(property(camelContext, java.io.File.class, value)); return true;
        case "runmode":
        case "runMode": getOrCreateConfiguration(target).setRunMode(property(camelContext, java.lang.String.class, value)); return true;
        case "skipteardownonexit":
        case "skipTeardownOnExit": getOrCreateConfiguration(target).setSkipTeardownOnExit(property(camelContext, boolean.class, value)); return true;
        case "splitoutputs":
        case "splitOutputs": getOrCreateConfiguration(target).setSplitOutputs(property(camelContext, java.lang.String.class, value)); return true;
        case "suitestatlevel":
        case "suiteStatLevel": getOrCreateConfiguration(target).setSuiteStatLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "suites": getOrCreateConfiguration(target).setSuites(property(camelContext, java.lang.String.class, value)); return true;
        case "summarytitle":
        case "summaryTitle": getOrCreateConfiguration(target).setSummaryTitle(property(camelContext, java.lang.String.class, value)); return true;
        case "tagdocs":
        case "tagDocs": getOrCreateConfiguration(target).setTagDocs(property(camelContext, java.lang.String.class, value)); return true;
        case "tagstatexcludes":
        case "tagStatExcludes": getOrCreateConfiguration(target).setTagStatExcludes(property(camelContext, java.lang.String.class, value)); return true;
        case "tagstatincludes":
        case "tagStatIncludes": getOrCreateConfiguration(target).setTagStatIncludes(property(camelContext, java.lang.String.class, value)); return true;
        case "tagstatlinks":
        case "tagStatLinks": getOrCreateConfiguration(target).setTagStatLinks(property(camelContext, java.lang.String.class, value)); return true;
        case "tags": getOrCreateConfiguration(target).setTags(property(camelContext, java.lang.String.class, value)); return true;
        case "tests": getOrCreateConfiguration(target).setTests(property(camelContext, java.lang.String.class, value)); return true;
        case "timestampoutputs":
        case "timestampOutputs": getOrCreateConfiguration(target).setTimestampOutputs(property(camelContext, boolean.class, value)); return true;
        case "variablefiles":
        case "variableFiles": getOrCreateConfiguration(target).setVariableFiles(property(camelContext, java.lang.String.class, value)); return true;
        case "variables": getOrCreateConfiguration(target).setVariables(property(camelContext, java.lang.String.class, value)); return true;
        case "warnonskippedfiles":
        case "warnOnSkippedFiles": getOrCreateConfiguration(target).setWarnOnSkippedFiles(property(camelContext, boolean.class, value)); return true;
        case "xunitfile":
        case "xunitFile": getOrCreateConfiguration(target).setXunitFile(property(camelContext, java.io.File.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("allowTemplateFromHeader", boolean.class);
        answer.put("argumentFile", java.io.File.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("combinedTagStats", java.lang.String.class);
        answer.put("configuration", org.apache.camel.component.robotframework.RobotFrameworkCamelConfiguration.class);
        answer.put("criticalTags", java.lang.String.class);
        answer.put("debugFile", java.io.File.class);
        answer.put("document", java.lang.String.class);
        answer.put("dryrun", boolean.class);
        answer.put("excludes", java.lang.String.class);
        answer.put("exitOnFailure", boolean.class);
        answer.put("includes", java.lang.String.class);
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
        answer.put("randomize", java.lang.String.class);
        answer.put("report", java.io.File.class);
        answer.put("reportBackground", java.lang.String.class);
        answer.put("reportTitle", java.lang.String.class);
        answer.put("runEmptySuite", boolean.class);
        answer.put("runFailed", java.io.File.class);
        answer.put("runMode", java.lang.String.class);
        answer.put("skipTeardownOnExit", boolean.class);
        answer.put("splitOutputs", java.lang.String.class);
        answer.put("suiteStatLevel", java.lang.String.class);
        answer.put("suites", java.lang.String.class);
        answer.put("summaryTitle", java.lang.String.class);
        answer.put("tagDocs", java.lang.String.class);
        answer.put("tagStatExcludes", java.lang.String.class);
        answer.put("tagStatIncludes", java.lang.String.class);
        answer.put("tagStatLinks", java.lang.String.class);
        answer.put("tags", java.lang.String.class);
        answer.put("tests", java.lang.String.class);
        answer.put("timestampOutputs", boolean.class);
        answer.put("variableFiles", java.lang.String.class);
        answer.put("variables", java.lang.String.class);
        answer.put("warnOnSkippedFiles", boolean.class);
        answer.put("xunitFile", java.io.File.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        RobotFrameworkComponent target = (RobotFrameworkComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowtemplatefromheader":
        case "allowTemplateFromHeader": return getOrCreateConfiguration(target).isAllowTemplateFromHeader();
        case "argumentfile":
        case "argumentFile": return getOrCreateConfiguration(target).getArgumentFile();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "combinedtagstats":
        case "combinedTagStats": return getOrCreateConfiguration(target).getCombinedTagStats();
        case "configuration": return target.getConfiguration();
        case "criticaltags":
        case "criticalTags": return getOrCreateConfiguration(target).getCriticalTags();
        case "debugfile":
        case "debugFile": return getOrCreateConfiguration(target).getDebugFile();
        case "document": return getOrCreateConfiguration(target).getDocument();
        case "dryrun": return getOrCreateConfiguration(target).isDryrun();
        case "excludes": return getOrCreateConfiguration(target).getExcludes();
        case "exitonfailure":
        case "exitOnFailure": return getOrCreateConfiguration(target).isExitOnFailure();
        case "includes": return getOrCreateConfiguration(target).getIncludes();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "listener": return getOrCreateConfiguration(target).getListener();
        case "listeners": return getOrCreateConfiguration(target).getListeners();
        case "log": return getOrCreateConfiguration(target).getLog();
        case "loglevel":
        case "logLevel": return getOrCreateConfiguration(target).getLogLevel();
        case "logtitle":
        case "logTitle": return getOrCreateConfiguration(target).getLogTitle();
        case "metadata": return getOrCreateConfiguration(target).getMetadata();
        case "monitorcolors":
        case "monitorColors": return getOrCreateConfiguration(target).getMonitorColors();
        case "monitorwidth":
        case "monitorWidth": return getOrCreateConfiguration(target).getMonitorWidth();
        case "name": return getOrCreateConfiguration(target).getName();
        case "nostatusreturncode":
        case "noStatusReturnCode": return getOrCreateConfiguration(target).isNoStatusReturnCode();
        case "noncriticaltags":
        case "nonCriticalTags": return getOrCreateConfiguration(target).getNonCriticalTags();
        case "output": return getOrCreateConfiguration(target).getOutput();
        case "outputdirectory":
        case "outputDirectory": return getOrCreateConfiguration(target).getOutputDirectory();
        case "randomize": return getOrCreateConfiguration(target).getRandomize();
        case "report": return getOrCreateConfiguration(target).getReport();
        case "reportbackground":
        case "reportBackground": return getOrCreateConfiguration(target).getReportBackground();
        case "reporttitle":
        case "reportTitle": return getOrCreateConfiguration(target).getReportTitle();
        case "runemptysuite":
        case "runEmptySuite": return getOrCreateConfiguration(target).isRunEmptySuite();
        case "runfailed":
        case "runFailed": return getOrCreateConfiguration(target).getRunFailed();
        case "runmode":
        case "runMode": return getOrCreateConfiguration(target).getRunMode();
        case "skipteardownonexit":
        case "skipTeardownOnExit": return getOrCreateConfiguration(target).isSkipTeardownOnExit();
        case "splitoutputs":
        case "splitOutputs": return getOrCreateConfiguration(target).getSplitOutputs();
        case "suitestatlevel":
        case "suiteStatLevel": return getOrCreateConfiguration(target).getSuiteStatLevel();
        case "suites": return getOrCreateConfiguration(target).getSuites();
        case "summarytitle":
        case "summaryTitle": return getOrCreateConfiguration(target).getSummaryTitle();
        case "tagdocs":
        case "tagDocs": return getOrCreateConfiguration(target).getTagDocs();
        case "tagstatexcludes":
        case "tagStatExcludes": return getOrCreateConfiguration(target).getTagStatExcludes();
        case "tagstatincludes":
        case "tagStatIncludes": return getOrCreateConfiguration(target).getTagStatIncludes();
        case "tagstatlinks":
        case "tagStatLinks": return getOrCreateConfiguration(target).getTagStatLinks();
        case "tags": return getOrCreateConfiguration(target).getTags();
        case "tests": return getOrCreateConfiguration(target).getTests();
        case "timestampoutputs":
        case "timestampOutputs": return getOrCreateConfiguration(target).isTimestampOutputs();
        case "variablefiles":
        case "variableFiles": return getOrCreateConfiguration(target).getVariableFiles();
        case "variables": return getOrCreateConfiguration(target).getVariables();
        case "warnonskippedfiles":
        case "warnOnSkippedFiles": return getOrCreateConfiguration(target).isWarnOnSkippedFiles();
        case "xunitfile":
        case "xunitFile": return getOrCreateConfiguration(target).getXunitFile();
        default: return null;
        }
    }
}

