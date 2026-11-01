package org.eclipse.jetty.http;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.safedk.android.internal.d;

/* JADX INFO: loaded from: classes7.dex */
public class HttpStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Code[] f65534a = new Code[508];

    public enum Code {
        CONTINUE(100, "Continue"),
        SWITCHING_PROTOCOLS(101, "Switching Protocols"),
        PROCESSING(102, "Processing"),
        OK(200, "OK"),
        CREATED(201, "Created"),
        ACCEPTED(202, "Accepted"),
        NON_AUTHORITATIVE_INFORMATION(203, "Non Authoritative Information"),
        NO_CONTENT(204, "No Content"),
        RESET_CONTENT(205, "Reset Content"),
        PARTIAL_CONTENT(206, "Partial Content"),
        MULTI_STATUS(207, "Multi-Status"),
        MULTIPLE_CHOICES(d.f44769a, "Multiple Choices"),
        MOVED_PERMANENTLY(301, "Moved Permanently"),
        MOVED_TEMPORARILY(302, "Moved Temporarily"),
        FOUND(302, "Found"),
        SEE_OTHER(303, "See Other"),
        NOT_MODIFIED(304, "Not Modified"),
        USE_PROXY(305, "Use Proxy"),
        TEMPORARY_REDIRECT(307, "Temporary Redirect"),
        BAD_REQUEST(400, "Bad Request"),
        UNAUTHORIZED(401, "Unauthorized"),
        PAYMENT_REQUIRED(402, "Payment Required"),
        FORBIDDEN(403, "Forbidden"),
        NOT_FOUND(404, "Not Found"),
        METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
        NOT_ACCEPTABLE(406, "Not Acceptable"),
        PROXY_AUTHENTICATION_REQUIRED(407, "Proxy Authentication Required"),
        REQUEST_TIMEOUT(408, "Request Timeout"),
        CONFLICT(409, "Conflict"),
        GONE(410, "Gone"),
        LENGTH_REQUIRED(411, "Length Required"),
        PRECONDITION_FAILED(TTAdConstant.IMAGE_URL_CODE, "Precondition Failed"),
        REQUEST_ENTITY_TOO_LARGE(TTAdConstant.VIDEO_INFO_CODE, "Request Entity Too Large"),
        REQUEST_URI_TOO_LONG(TTAdConstant.VIDEO_URL_CODE, "Request-URI Too Long"),
        UNSUPPORTED_MEDIA_TYPE(TTAdConstant.VIDEO_COVER_URL_CODE, "Unsupported Media Type"),
        REQUESTED_RANGE_NOT_SATISFIABLE(416, "Requested Range Not Satisfiable"),
        EXPECTATION_FAILED(TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, "Expectation Failed"),
        UNPROCESSABLE_ENTITY(TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, "Unprocessable Entity"),
        LOCKED(TypedValues.CycleType.TYPE_WAVE_PERIOD, "Locked"),
        FAILED_DEPENDENCY(TypedValues.CycleType.TYPE_WAVE_OFFSET, "Failed Dependency"),
        INTERNAL_SERVER_ERROR(500, "Server Error"),
        NOT_IMPLEMENTED(501, "Not Implemented"),
        BAD_GATEWAY(502, "Bad Gateway"),
        SERVICE_UNAVAILABLE(503, "Service Unavailable"),
        GATEWAY_TIMEOUT(504, "Gateway Timeout"),
        HTTP_VERSION_NOT_SUPPORTED(505, "HTTP Version Not Supported"),
        INSUFFICIENT_STORAGE(507, "Insufficient Storage");

        private final int _code;
        private final String _message;

        @Override // java.lang.Enum
        public String toString() {
            return String.format("[%03d %s]", Integer.valueOf(this._code), getMessage());
        }

        public boolean equals(int i10) {
            return this._code == i10;
        }

        public int getCode() {
            return this._code;
        }

        public String getMessage() {
            return this._message;
        }

        public boolean isClientError() {
            return HttpStatus.c(this._code);
        }

        public boolean isInformational() {
            return HttpStatus.d(this._code);
        }

        public boolean isRedirection() {
            return HttpStatus.e(this._code);
        }

        public boolean isServerError() {
            return HttpStatus.f(this._code);
        }

        public boolean isSuccess() {
            return HttpStatus.g(this._code);
        }

        Code(int i10, String str) {
            this._code = i10;
            this._message = str;
        }
    }

    public static boolean c(int i10) {
        return 400 <= i10 && i10 <= 499;
    }

    public static boolean d(int i10) {
        return 100 <= i10 && i10 <= 199;
    }

    public static boolean e(int i10) {
        return 300 <= i10 && i10 <= 399;
    }

    public static boolean f(int i10) {
        return 500 <= i10 && i10 <= 599;
    }

    public static boolean g(int i10) {
        return 200 <= i10 && i10 <= 299;
    }

    static {
        for (Code code : Code.values()) {
            f65534a[code._code] = code;
        }
    }

    public static Code a(int i10) {
        if (i10 <= 507) {
            return f65534a[i10];
        }
        return null;
    }

    public static String b(int i10) {
        Code codeA = a(i10);
        if (codeA != null) {
            return codeA.getMessage();
        }
        return Integer.toString(i10);
    }
}
