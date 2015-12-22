package org.sonar.javascript.angular.util;

import java.io.File;
import java.nio.charset.Charset;

/**
 * Created by thibaud.bourgeois on 20/12/2015.
 * Angular util class.
 */
public class AngularUtil {

    public static final String ROOT_SCOPE = "$rootScope";
    public static final String SCOPE = "$scope";

    public static final String CONTROLLER = "controller";
    public static final String DIRECTIVE = "directive";
    public static final String SERVICE = "service";
    public static final String FACTORY = "factory";
    public static final String FILTER = "filter";
    public static final String PROVIDER = "provider";

    private static final String PATTERN_START = "\\.";
    private static final String PATTERN_END = "\\(";

    public static boolean isController(File file, Charset charset) {
        return FileUtil.findPattern(file, charset, PATTERN_START + CONTROLLER + PATTERN_END);
    }

    public static boolean isDirective(File file, Charset charset) {
        return FileUtil.findPattern(file, charset, PATTERN_START + DIRECTIVE + PATTERN_END);
    }

    public static boolean isService(File file, Charset charset) {
        return FileUtil.findPattern(file, charset, PATTERN_START + SERVICE + PATTERN_END);
    }

    public static boolean isFactory(File file, Charset charset) {
        return FileUtil.findPattern(file, charset, PATTERN_START + FACTORY + PATTERN_END);
    }

    public static boolean isFilter(File file, Charset charset) {
        return FileUtil.findPattern(file, charset, PATTERN_START + FILTER + PATTERN_END);
    }

    public static boolean isProvider(File file, Charset charset) {
        return FileUtil.findPattern(file, charset, PATTERN_START + PROVIDER + PATTERN_END);
    }

    public static boolean isObjectScope(String object) {
        return ROOT_SCOPE.equals(object)
                || SCOPE.equals(object);
    }
}
