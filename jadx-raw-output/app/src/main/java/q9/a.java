package q9;

import android.net.ParseException;
import android.util.Log;
import com.google.gson.JsonParseException;
import com.google.gson.stream.MalformedJsonException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import me.goldze.mvvmhabit.http.ResponseThrowable;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONException;
import retrofit2.HttpException;

/* JADX INFO: compiled from: ExceptionHandle.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static ResponseThrowable a(Throwable th2) {
        Log.i("Response", "异常为：" + th2.toString());
        if (th2 instanceof HttpException) {
            ResponseThrowable responseThrowable = new ResponseThrowable(th2, 1003);
            int iCode = ((HttpException) th2).code();
            if (iCode == 401) {
                responseThrowable.message = "操作未授权";
            } else if (iCode == 408) {
                responseThrowable.message = "服务器执行超时";
            } else if (iCode == 500) {
                responseThrowable.message = "服务器内部错误";
            } else if (iCode == 503) {
                responseThrowable.message = "服务器不可用";
            } else if (iCode == 403) {
                responseThrowable.message = "请求被拒绝";
            } else if (iCode != 404) {
                responseThrowable.message = "网络错误";
            } else {
                responseThrowable.message = "资源不存在";
            }
            return responseThrowable;
        }
        if ((th2 instanceof JsonParseException) || (th2 instanceof JSONException) || (th2 instanceof ParseException) || (th2 instanceof MalformedJsonException)) {
            ResponseThrowable responseThrowable2 = new ResponseThrowable(th2, 1001);
            responseThrowable2.message = "解析错误";
            return responseThrowable2;
        }
        if ((th2 instanceof ConnectException) || (th2 instanceof UnknownHostException)) {
            ResponseThrowable responseThrowable3 = new ResponseThrowable(th2, 1002);
            responseThrowable3.message = "连接失败";
            return responseThrowable3;
        }
        if (th2 instanceof SSLException) {
            ResponseThrowable responseThrowable4 = new ResponseThrowable(th2, 1005);
            responseThrowable4.message = "证书验证失败";
            return responseThrowable4;
        }
        if (th2 instanceof ConnectTimeoutException) {
            ResponseThrowable responseThrowable5 = new ResponseThrowable(th2, 1006);
            responseThrowable5.message = "连接超时";
            return responseThrowable5;
        }
        if (th2 instanceof SocketTimeoutException) {
            ResponseThrowable responseThrowable6 = new ResponseThrowable(th2, 1006);
            responseThrowable6.message = "连接超时";
            return responseThrowable6;
        }
        ResponseThrowable responseThrowable7 = new ResponseThrowable(th2, 1000);
        responseThrowable7.message = "未知错误";
        return responseThrowable7;
    }
}
