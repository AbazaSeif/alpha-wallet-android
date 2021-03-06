package io.stormbird.wallet;

public abstract class C {

    public static final int IMPORT_REQUEST_CODE = 1001;
    public static final int EXPORT_REQUEST_CODE = 1002;
    public static final int SHARE_REQUEST_CODE = 1003;

    public static final String ETHEREUM_NETWORK_NAME = "Ethereum";
    public static final String CLASSIC_NETWORK_NAME = "Ethereum Classic";
    public static final String POA_NETWORK_NAME = "POA Network";
    public static final String KOVAN_NETWORK_NAME = "Kovan (Test)";
    public static final String ROPSTEN_NETWORK_NAME = "Ropsten (Test)";
    public static final String SOKOL_NETWORK_NAME = "Sokol (Test)";
    public static final String RINKEBY_NETWORK_NAME = "Rinkeby (Test)";

    public static final String ETHEREUM_TICKER = "ethereum";
    public static final String POA_TIKER = "poa";

    public static final String USD_SYMBOL = "$";
    public static final String ETH_SYMBOL = "ETH";
    public static final String POA_SYMBOL = "POA";
    public static final String ETC_SYMBOL = "ETC";

    public static final String GWEI_UNIT = "Gwei";

    public static final String MARKET_SALE = "market";

    public static final String EXTRA_ADDRESS = "ADDRESS";
    public static final String EXTRA_CONTRACT_ADDRESS = "CONTRACT_ADDRESS";
    public static final String EXTRA_DECIMALS = "DECIMALS";
    public static final String EXTRA_SYMBOL = "SYMBOL";
    public static final String EXTRA_SENDING_TOKENS = "SENDING_TOKENS";
    public static final String EXTRA_TO_ADDRESS = "TO_ADDRESS";
    public static final String EXTRA_AMOUNT = "AMOUNT";
    public static final String EXTRA_GAS_PRICE = "GAS_PRICE";
    public static final String EXTRA_GAS_LIMIT = "GAS_LIMIT";
    public static final String EXTRA_CONTRACT_NAME = "NAME";
    public static final String EXTRA_TOKEN_ID = "TID";
    public static final String EXTRA_TOKEN_BALANCE = "BALANCE";
    public static final String EXTRA_TOKENID_LIST = "TOKENIDLIST";
    public static final String ERC875RANGE = "ERC875RANGE";
    public static final String TOKEN_TYPE = "TOKEN_TYPE";
    public static final String MARKET_INSTANCE = "MARKET_INSTANCE";
    public static final String IMPORT_STRING = "TOKEN_IMPORT";
    public static final String EXTRA_PRICE = "TOKEN_PRICE";
    public static final String EXTRA_STATE = "TRANSFER_STATE";
    public static final String EXTRA_WEB3TRANSACTION = "WEB3_TRANSACTION";
    public static final String EXTRA_NETWORK_NAME = "NETWORK_NAME";
    public static final String EXTRA_NETWORK_MAINNET = "NETWORK_MAINNET";

    public static final String PRUNE_ACTIVITY =
            "io.stormbird.wallet.PRUNE_ACTIVITY";

    public static final String RESET_WALLET =
            "io.stormbird.wallet.RESET";
    public static final String ADDED_TOKEN =
            "io.stormbird.wallet.ADDED";
    public static final String CHANGED_LOCALE =
            "io.stormbird.wallet.CHANGED_LOCALE";
    public static final String DOWNLOAD_READY =
            "io.stormbird.wallet.DOWNLOAD_READY";
    public static final String PAGE_LOADED =
            "io.stormbird.wallet.PAGE_LOADED";
    public static final String RESET_TOOLBAR =
            "io.stormbird.wallet.RESET_TOOLBAR";
    public static final String COINBASE_WIDGET_CODE = "88d6141a-ff60-536c-841c-8f830adaacfd";
    public static final String SHAPESHIFT_KEY = "c4097b033e02163da6114fbbc1bf15155e759ddfd8352c88c55e7fef162e901a800e7eaecf836062a0c075b2b881054e0b9aa2324be7bc3694578493faf59af4";
    public static final String CHANGELLY_REF_ID = "968d4f0f0bf9";
    public static final String DONATION_ADDRESS = "0xb1aD48527d694D30401D082bcD21a33F41811501";

    public static final String DEFAULT_GAS_PRICE = "30000000000";
    public static final String DEFAULT_GAS_LIMIT = "90000";
    public static final String DEFAULT_GAS_LIMIT_FOR_TOKENS = "144000";
    public static final long GAS_LIMIT_MIN = 21000L;
    public static final long GAS_LIMIT_MAX = 300000L;
    public static final long GAS_PRICE_MIN = 1000000000L;
    public static final long NETWORK_FEE_MAX = 90000000000000000L;
    public static final int ETHER_DECIMALS = 18;

    //FOR DEMOS ETC
    public static final boolean SHOW_NEW_ACCOUNT_PROMPT = false;   //this will switch off the splash screen 'please make a key' message
    public static final boolean HARD_CODED_KEY = false;           //pre-loads a hard coded key in the app
    public static final boolean HARD_CODED_CONTRACT = false;      //pre-loads the contract as specified below
    public static final boolean OVERRIDE_DEFAULT_NETWORK = false;  //use the default network given below

    //Range of 3 test keys, they all have a little test eth pre-loaded on them
    public static final String HARD_PRIVATE_KEY1 = "bddb287b00c8047587f4fbf3de731a30f9404aa3735ae5d1766550534cf939da"; //0xc9034FF4266b1690d2B579584e5c3259009eD13c
    public static final String HARD_PRIVATE_KEY2 = "dcd6318be4fa8ab458b608804f06b8f25ccdab4f9d03c26fbbbe2b58e42f4df5"; //0x97e2bde4654Ca8Ea2cC30335Ea85eC1F9b10604A
    public static final String HARD_PRIVATE_KEY3 = "fa41ce4f689c883584cfcf29cd2526c7f4de4dede260753b0234e475b216a733"; //0x93922cDaBAa26d50E7C6Cb19EE3bCd03462Ed334

    //Pick which private key to pre-install
    public static final String PRE_LOADED_KEY = HARD_PRIVATE_KEY3;
    public static final String HARD_CONTRACT_ADDR = "0x0B6732BAECC0793E38A98934799ABD3C7DC3CF31";

    public static final String DEFAULT_NETWORK = ETHEREUM_NETWORK_NAME;

    public static final String TWITTER_PACKAGE_NAME = "com.twitter.android";
    public static final String FACEBOOK_PACKAGE_NAME = "com.facebook.katana";
    public static final String AWALLET_TWITTER_ID = "twitter://user?user_id=938624096123764736";
    public static final String AWALLET_FACEBOOK_ID = "fb://page/1958651857482632";
    public static final String AWALLET_TWITTER_URL = "https://twitter.com/Alpha_wallet";
    public static final String AWALLET_FACEBOOK_URL = "https://www.facebook.com/AlphaWallet/";

    public interface ErrorCode {
        int UNKNOWN = 1;
        int CANT_GET_STORE_PASSWORD = 2;
        int ALREADY_ADDED = 3;
        int EMPTY_COLLECTION = 4;
    }

    public interface Key {
        String WALLET = "wallet";
        String TRANSACTION = "transaction";
        String TICKET = "ticket";
        String TICKET_RANGE = "ticket_range";
        String MARKETPLACE_EVENT = "marketplace_event";
        String SHOULD_SHOW_SECURITY_WARNING = "should_show_security_warning";
        String FROM_SETTINGS = "from_settings";
    }

    public static final String ETH_RPC_URL = "https://mainnet.infura.io/llyrtzQ3YhkdESt2Fzrk";
    public static final String DAPP_LASTURL_KEY = "dappURL";
    public static final String DAPP_BROWSER_HISTORY = "dappBrowserHistory";
    public static final String DAPP_BROWSER_BOOKMARKS = "dappBrowserBookmarks";
    public static final String DAPP_DEFAULT_URL = "https://www.stateofthedapps.com/";

    public enum TokenStatus {
        DEFAULT, PENDING, INCOMPLETE
    }
}