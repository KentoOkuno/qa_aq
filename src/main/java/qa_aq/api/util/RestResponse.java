//package qa_aq.api.util;
//
//import org.springframework.http.HttpStatus;
//
///**
// * Dx3の真似をした<br />
// * PostとかPutのときはこいつを使うっポイ
// * Getはそのままdto返してた！
// */
//public class RestResponse {
//    /**
//     * デフォルトコンストラクタ<br />
//     * httpステータスを設定することを必須とする
//     * @param httpStatus httpステータス
//     */
//    public RestResponse(HttpStatus httpStatus) {
//        this.httpStatus = httpStatus;
//    }
//
//    /**
//     * 実行成否フラグ設定コンストラクタ<br />
//     * httpステータスと実行成否フラグの設定
//     * @param httpStatus httpステータス
//     * @param success 実行成否フラグ
//     */
//    public RestResponse(HttpStatus httpStatus, boolean success) {
//        this.httpStatus = httpStatus;
//        this.success = success;
//    }
//
//    /** リクエストパス */
//    public String path;
//
//    /** Httpステータス */
//    public HttpStatus httpStatus;
//
//    /** レスポンスメッセージ */
//    public String message;
//
//    /** 実行成否フラグ */
//    public boolean success = false;
//}
