package co.Qualitrix.api.config;

/**
 * @author Binayak
 *
 */
public interface DBConstants {

    /**
     * ENUM : DB Table names and Primary keys
     *
     * @author Binayak
     *
     */
    public enum DBTableNames {
        POST_REPLICA1("post_replica1", "id"), POST_REPLICA3("post_replica3", "id"), USER("user", "id"),
        PRESENT_LANG("presentLang", "id"), VERIFICATION("verification", "userId"), GROUP_TAG("group-tag", "groupId"),
        REFERRAL_PAYMENT2("referral-payment2", "userId"), POST_COUNTERS("post_counters", "id"),
        FAVOURITE_AUDIO("favouriteAudio", "userId"),PAYMENT_DETAILS("payment-details","userId"),
        GLOBAL_TAG_AFFINITY("globalTagAffinity","tagId"),
        CHAMPIONS_RANKING("championsRanking","userId"), BUCKET("bucket","bucketId");


        private String tableName;
        private String pKey;

        private DBTableNames(String tableName, String pKey) {
            this.setTableName(tableName);
            this.setpKey(pKey);
        }

        public String getTableName() {
            return tableName;
        }

        public void setTableName(String tableName) {
            this.tableName = tableName;
        }

        public String getpKey() {
            return pKey;
        }

        public void setpKey(String pKey) {
            this.pKey = pKey;
        }
    };
}
