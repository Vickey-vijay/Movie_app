package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ae3 {
    public static be3 a(String str) {
        if (str == null) {
            str = "Ad request failed with network error";
        }
        return new be3(str);
    }

    public static be3 b() {
        return new be3("Server temporarily unavailable. Please, try again later.");
    }

    public static be3 a(zl0 zl0Var) {
        String message = zl0Var.getMessage();
        if (message == null) {
            message = "Ad request completed successfully, but there are no ads available.";
        }
        return new be3(message);
    }

    public static be3 b(String str) {
        return new be3(str);
    }

    public static be3 a() {
        return new be3("Internal error. Failed to parse response");
    }
}
