package co.Qualitrix.api.helper;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Map;
import java.util.logging.Logger;


import co.Qualitrix.api.config.Constants;
import io.restassured.specification.RequestSpecification;

/**
 * @author Dheeraj
 *
 */
public class RequestGenerator extends RestBaseClass implements Constants {

    static String sourceClass = RequestGenerator.class.getName();
    static Logger LOGGER = Logger.getLogger(sourceClass);
    String sourceMethod;

    RequestSpecification requestSpecification;

    /**
     * @author Ooviya
     * @param baseUri
     * @return RequestSpecification
     */
    public RequestSpecification getRequest(String baseUri) {
        sourceMethod = "getRequest";
        LOGGER.entering(sourceClass, sourceMethod);

        try {
            LOGGER.info("baseUri " + baseUri);
            requestSpecification = given().contentType(APPLICATION_JSON)
                    .baseUri(PropertyReader.getPropertyValue(URL_PROPERTIES_PATH, baseUri));
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.exiting(sourceClass, sourceMethod);
        return requestSpecification;
    }

    /**
     * @author Ooviya
     * @param baseUri
     * @param request
     * @return RequestSpecification
     */
    public RequestSpecification getRequest(String baseUri, Object request) {
        sourceMethod = "getRequest";
        LOGGER.entering(sourceClass, sourceMethod);
        try {

            LOGGER.info("baseUri " + baseUri);
            LOGGER.info("request " + request.toString());
            requestSpecification = given().contentType(APPLICATION_JSON)
                    .baseUri(PropertyReader.getPropertyValue(URL_PROPERTIES_PATH, baseUri)).body(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.info("requestSpecification : " + requestSpecification);
        LOGGER.exiting(sourceClass, sourceMethod);
        return requestSpecification;

    }

    /**
     * @author Ooviya
     * @param header
     * @param baseUri
     * @return RequestSpecification
     */
    public RequestSpecification getRequest(Map<String, String> header, String baseUri) {
        sourceMethod = "getRequest";
        LOGGER.entering(sourceClass, sourceMethod);
        try {
            LOGGER.info("baseUri " + baseUri);
            LOGGER.info("header " + header);

            requestSpecification = given().contentType(APPLICATION_JSON)
                    .baseUri(PropertyReader.getPropertyValue(URL_PROPERTIES_PATH, baseUri)).headers(header).with();
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.exiting(sourceClass, sourceMethod);
        return requestSpecification;
    }

    /**
     * @author Ooviya
     * @param header
     * @param baseUri
     * @param multipartValue
     * @param fileType
     * @return RequestSpecification
     */
    public RequestSpecification getRequest(Map<String, String> header, String baseUri, String multipartValue,
                                           String fileType) {
        sourceMethod = "getRequest";
        LOGGER.entering(sourceClass, sourceMethod);
        try {
            LOGGER.info("baseUri " + baseUri);
            LOGGER.info("header " + header);
            URL res = RequestGenerator.class.getResource(multipartValue);
            File media = Paths.get(res.toURI()).toFile();

            LOGGER.info("Media exist: " + media.exists());

            requestSpecification = given().contentType(FORM_DATA_TYPE)
                    .baseUri(PropertyReader.getPropertyValue(URL_PROPERTIES_PATH, baseUri)).headers(header)
                    .multiPart(MEDIA_USER_FILE, media, fileType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.exiting(sourceClass, sourceMethod);
        return requestSpecification;
    }

    /**
     * @param header
     * @param baseUri
     * @param request
     * @return RequestSpecification
     */

    public RequestSpecification getRequest(Map<String, String> header, String baseUri, Object request) {
        sourceMethod = "getRequest";
        LOGGER.entering(sourceClass, sourceMethod);
        try {
            LOGGER.info("baseUri " + baseUri);
            LOGGER.info("request " + request.toString());
            LOGGER.info("header " + header);

            requestSpecification = given().contentType(APPLICATION_JSON)
                    .baseUri(PropertyReader.getPropertyValue(URL_PROPERTIES_PATH, baseUri)).headers(header)
                    .body(request);

        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.exiting(sourceClass, sourceMethod);
        return requestSpecification;
    }

    /**
     * @author Ooviya
     * @param baseUri
     * @param queryParam
     * @return RequestSpecification
     */
    public RequestSpecification getRequest(String baseUri, Map<String, String> queryParam) {
        sourceMethod = "getRequest";
        LOGGER.entering(sourceClass, sourceMethod);
        try {
            LOGGER.info("baseUri " + baseUri);
            LOGGER.info("queryParam " + queryParam);
            requestSpecification = given().contentType(APPLICATION_JSON)
                    .baseUri(PropertyReader.getPropertyValue(URL_PROPERTIES_PATH, baseUri)).queryParams(queryParam);
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.exiting(sourceClass, sourceMethod);
        return requestSpecification;
    }

    /**
     * @author Ooviya
     * @param baseUri
     * @param request
     * @param queryParam
     * @return RequestSpecification
     */
    public RequestSpecification getRequest(String baseUri, Object request, Map<String, String> queryParam) {
        sourceMethod = "getRequest";
        LOGGER.entering(sourceClass, sourceMethod);
        try {
            LOGGER.info("baseUri " + baseUri);
            LOGGER.info("request " + request.toString());
            LOGGER.info("queryParam " + queryParam);

            requestSpecification = given().contentType(APPLICATION_JSON)
                    .baseUri(PropertyReader.getPropertyValue(URL_PROPERTIES_PATH, baseUri)).queryParams(queryParam)
                    .body(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.exiting(sourceClass, sourceMethod);
        return requestSpecification;

    }

    /**
     * @author Ooviya
     * @param baseUri
     * @param pathParam
     * @param request
     * @return
     */
    public RequestSpecification getRequest(String baseUri, Map<String, String> pathParam, Object request) {
        sourceMethod = "getRequest";
        LOGGER.entering(sourceClass, sourceMethod);
        try {
            LOGGER.info("baseUri " + baseUri);
            LOGGER.info("request " + request.toString());
            LOGGER.info("queryParam " + pathParam);

            requestSpecification = given().contentType(APPLICATION_JSON)
                    .baseUri(PropertyReader.getPropertyValue(URL_PROPERTIES_PATH, baseUri)).pathParams(pathParam)
                    .body(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.exiting(sourceClass, sourceMethod);
        return requestSpecification;

    }

    /**
     * @author Ooviya
     * @param header
     * @param baseUri
     * @param pathParam
     * @return RequestSpecification
     */
    public RequestSpecification getRequest(Map<String, String> header, String baseUri, Map<String, String> pathParam) {
        sourceMethod = "getRequest";
        LOGGER.entering(sourceClass, sourceMethod);
        try {
            LOGGER.info("baseUri " + baseUri);
            LOGGER.info("header " + header);
            LOGGER.info("pathParam " + pathParam);

            requestSpecification = given().contentType(APPLICATION_JSON)
                    .baseUri(PropertyReader.getPropertyValue(URL_PROPERTIES_PATH, baseUri)).headers(header)
                    .pathParams(pathParam);
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.exiting(sourceClass, sourceMethod);
        return requestSpecification;
    }

    /**
     * @author Ooviya
     * @param header
     * @param baseUri
     * @param queryParam
     * @param pathParam
     * @return RequestSpecification
     */
    public RequestSpecification getRequest(Map<String, String> header, String baseUri, Map<String, String> queryParam,
                                           Map<String, String> pathParam) {
        sourceMethod = "getRequest";
        LOGGER.entering(sourceClass, sourceMethod);
        try {
            LOGGER.info("baseUri " + baseUri);
            LOGGER.info("header " + header);
            LOGGER.info("queryParam " + queryParam);
            LOGGER.info("pathParam " + pathParam);

            requestSpecification = given().contentType(APPLICATION_JSON)
                    .baseUri(PropertyReader.getPropertyValue(URL_PROPERTIES_PATH, baseUri)).headers(header)
                    .queryParams(queryParam).pathParams(pathParam);
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.exiting(sourceClass, sourceMethod);
        return requestSpecification;

    }

    /**
     * @author Ooviya
     * @param header
     * @param baseUri
     * @param queryParam
     * @param pathParam
     * @return RequestSpecification
     */
    public RequestSpecification getRequest(Map<String, String> queryParam, Map<String, String> pathParam,
                                           String baseUri) {
        sourceMethod = "getRequest";
        LOGGER.entering(sourceClass, sourceMethod);
        try {
            LOGGER.info("baseUri " + baseUri);
            LOGGER.info("queryParam " + queryParam);
            LOGGER.info("pathParam " + pathParam);

            requestSpecification = given().contentType(APPLICATION_JSON)
                    .baseUri(PropertyReader.getPropertyValue(URL_PROPERTIES_PATH, baseUri)).queryParams(queryParam)
                    .pathParams(pathParam);
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.exiting(sourceClass, sourceMethod);
        return requestSpecification;
    }

    /**
     * @author Ooviya
     * @param header
     * @param baseUri
     * @param queryParam
     * @return RequestSpecification
     */
    public RequestSpecification getRequest(String baseUri, Map<String, String> header, Map<String, String> queryParam) {
        sourceMethod = "getRequest";
        LOGGER.entering(sourceClass, sourceMethod);
        try {
            LOGGER.info("baseUri " + baseUri);
            LOGGER.info("header " + header);
            LOGGER.info("queryParam " + queryParam);

            requestSpecification = given().contentType(APPLICATION_JSON)
                    .baseUri(PropertyReader.getPropertyValue(URL_PROPERTIES_PATH, baseUri)).headers(header)
                    .queryParams(queryParam);
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.exiting(sourceClass, sourceMethod);
        return requestSpecification;

    }

    /**
     * @author Pavani
     * @param header
     * @param baseUri
     * @param queryParam
     * @param request
     * @return RequestSpecification
     */
    public RequestSpecification getRequest(String baseUri, Map<String, String> header, Map<String, String> queryParam,
                                           Object request) {
        sourceMethod = "getRequest";
        LOGGER.entering(sourceClass, sourceMethod);
        try {
            LOGGER.info("baseUri " + baseUri);
            LOGGER.info("header " + header);
            LOGGER.info("queryParam " + queryParam);

            requestSpecification = given().contentType(APPLICATION_JSON)
                    .baseUri(PropertyReader.getPropertyValue(URL_PROPERTIES_PATH, baseUri)).headers(header)
                    .queryParams(queryParam).body(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.exiting(sourceClass, sourceMethod);
        return requestSpecification;

    }

    /**
     * @author Pavani
     * @param header
     * @param baseUri
     * @param pathParam
     * @param request
     * @return RequestSpecification
     */
    public RequestSpecification getRequest(Map<String, String> header, String baseUri, Map<String, String> pathParam,
                                           Object request) {
        sourceMethod = "getRequest";
        LOGGER.entering(sourceClass, sourceMethod);
        try {
            LOGGER.info("baseUri " + baseUri);
            LOGGER.info("header " + header);
            LOGGER.info("pathParam " + pathParam);

            requestSpecification = given().contentType(APPLICATION_JSON)
                    .baseUri(PropertyReader.getPropertyValue(URL_PROPERTIES_PATH, baseUri)).headers(header)
                    .pathParams(pathParam).body(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.exiting(sourceClass, sourceMethod);
        return requestSpecification;

    }
}
