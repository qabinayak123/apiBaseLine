package co.Qualitrix.api.config;

public interface Constants {
    /* **************** Property file paths **************** */
    String URL_PROPERTIES_PATH = "./src/main/java/co/Qualitrix/api/config/URL_Config.properties";
    String GOOGLE_SPREADSHEET_PROPERTIES_PATH = "./src/main/java/co/Qualitrix/api/config/GoogleSheetIDs_Config.properties";
    String COMMON_PROPERTIES_PATH = "./src/main/java/co/Qualitrix/api/config/CommonValues.properties";
    String FILE_PATHS_PROPERTIES_PATH = "./src/main/java/co/Qualitrix/api/config/FilePathsConfig.properties";

    /* **************** Environments **************** */
    String ENVIRONMENT = System.getProperty("env");
    /* **************** Headers **************** */
    String APPLICATION_JSON = "application/json";
    String FORM_DATA_TYPE = "multipart/form-data";
    String QUALITRIX_AUTHORIZED_USERID = "X-SHARECHAT-AUTHORIZED-USERID";
    String QUALITRIX_SECRET = "X-SHARECHAT-SECRET";
    String QUALITRIX_USER_ID = "X-SHARECHAT-USERID";
    String QUALITRIX_REVIEWER_ID = "X-SHARECHAT-AUTHORIZED-REVIEWERID";
    String QUALITRIX_GCP_AUTH = "x-sharechat-aws-gcp-auth-header";
    String MEDIA_USER_FILE = "userfile";

    /* **************** Excel paths **************** */
    String ABC_SERVICE_XL_PATH = "./Test Data/abcServiceTestData.xlsx";
    String XL_PATH = "./Test Data/TestData2.xlsx";
    String BCD_SERVICE_XL_PATH = "./Test Data/bcdServiceTestData.xlsx";
    String CDE_SERVICE_XL_PATH = "./Test Data/cdeServiceData.xlsx";
    String DEF_SERVICE_XL_PATH = "./Test Data/defServiceTestData.xlsx";

    /* ************* abc Upload Service ***************** */
    String abc_UPLOAD_SERVICE = "MEDIA_UPLOAD_SERVICE"; //Same name will be given in Constants,URL_config properties file and Google sheetIds properties file
    String abc_UPLOAD = "/mediaUpload";
    String abc_UPLOAD_SHEET = "MediaUpload";
    String abc_MEDIA_UPLOAD_SHEET = "LocalMediaUpload";
    String abc_UPLOAD_NEGATIVE_SHEET = "MediaUploadNegative";
    String abc_UPLOAD_DAILY_LIMIT_SHEET = "MediaUploadDailyLimit";
    String abc_USER_FILE = "userfile";

}
