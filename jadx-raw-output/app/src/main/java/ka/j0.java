package ka;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.UpdateEvent;
import com.mgs.carparking.ui.mine.feedback.FeedbackActivity;
import com.safedk.android.utils.Logger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import me.goldze.mvvmhabit.base.BaseApplication;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import sa.o0;

/* JADX INFO: compiled from: UpdateUtil.java */
/* JADX INFO: loaded from: classes10.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f62683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mi.b f62684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ProgressBar f62685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f62686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f62687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f62688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f62689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f62690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f62691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f62692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f62693k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Dialog f62697o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f62694l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f62695m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String[] f62696n = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f62698p = false;

    /* JADX INFO: compiled from: UpdateUtil.java */
    public class a implements ii.r<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public mi.b f62699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f62700c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f62701d;

        /* JADX INFO: renamed from: ka.j0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: UpdateUtil.java */
        public class C0559a extends ClickableSpan {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f62703b;

            public C0559a(String str) {
                this.f62703b = str;
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(@NonNull View view) {
                sa.a.a(a.this.f62701d, this.f62703b);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(@NonNull TextPaint textPaint) {
                textPaint.setColor(Color.parseColor("#365899"));
                textPaint.setUnderlineText(false);
            }
        }

        /* JADX INFO: compiled from: UpdateUtil.java */
        public class b implements View.OnClickListener {
            public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
                Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
                if (p11 == null) {
                    return;
                }
                p10.startActivity(p11);
            }

            public b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(a.this.f62701d, (Class<?>) FeedbackActivity.class);
                intent.putExtra("flag", 2);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(a.this.f62701d, intent);
            }
        }

        /* JADX INFO: compiled from: UpdateUtil.java */
        public class c implements View.OnClickListener {
            public c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                j0.this.f62697o.dismiss();
            }
        }

        /* JADX INFO: compiled from: UpdateUtil.java */
        public class d implements View.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateEvent f62707b;

            public d(UpdateEvent updateEvent) {
                this.f62707b = updateEvent;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!sa.e.q()) {
                    j0.this.E(this.f62707b.getResult().getUrl(), this.f62707b.getResult().getForce_upgrade());
                }
            }
        }

        /* JADX INFO: compiled from: UpdateUtil.java */
        public class e implements View.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateEvent f62709b;

            public e(UpdateEvent updateEvent) {
                this.f62709b = updateEvent;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!sa.e.q()) {
                    j0.this.E(this.f62709b.getResult().getUrl(), this.f62709b.getResult().getForce_upgrade());
                }
            }
        }

        @Override // ii.r
        public void onComplete() {
        }

        @Override // ii.r
        public void onError(Throwable th2) {
        }

        public a(boolean z10, Context context) {
            this.f62700c = z10;
            this.f62701d = context;
        }

        @Override // ii.r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(String str) {
            Log.i("wangyi", "result：" + str);
            String strA = em.a.a(str);
            if (this.f62700c && em.o.b(strA)) {
                em.p.b(em.r.a().getResources().getString(R.string.str_new_version));
                return;
            }
            try {
                int i10 = this.f62701d.getPackageManager().getPackageInfo(this.f62701d.getPackageName(), 0).versionCode;
                if (sa.k.e(strA, UpdateEvent.class)) {
                    UpdateEvent updateEvent = (UpdateEvent) sa.k.b(strA, UpdateEvent.class);
                    Log.i("wangyi", "版本号为：" + i10);
                    Log.i("wangyi", "信息为：" + strA.toString() + "---" + updateEvent.getResult());
                    if (updateEvent.getCode() != 10000 || updateEvent.getResult() == null) {
                        if (this.f62700c) {
                            em.p.b(em.r.a().getResources().getString(R.string.str_version_isnew));
                            return;
                        } else {
                            tl.a.a().b(new x9.g());
                            tl.a.a().b(new x9.u());
                            return;
                        }
                    }
                    if (updateEvent.getResult().getVersion() <= 40000) {
                        if (this.f62700c) {
                            em.p.b(em.r.a().getResources().getString(R.string.str_version_isnew));
                            return;
                        } else {
                            tl.a.a().b(new x9.u());
                            return;
                        }
                    }
                    View viewInflate = LayoutInflater.from(this.f62701d).inflate(R.layout.pop_layout_update, (ViewGroup) null);
                    j0.this.f62685c = (ProgressBar) viewInflate.findViewById(R.id.progress);
                    j0.this.f62687e = (TextView) viewInflate.findViewById(R.id.tv_title);
                    j0.this.f62688f = (TextView) viewInflate.findViewById(R.id.tv_content);
                    j0.this.f62690h = (TextView) viewInflate.findViewById(R.id.upgrade);
                    j0.this.f62689g = (TextView) viewInflate.findViewById(R.id.tv_cancel);
                    j0.this.f62686d = (TextView) viewInflate.findViewById(R.id.tv_progress_num);
                    j0.this.f62693k = (LinearLayout) viewInflate.findViewById(R.id.ll_bottom);
                    j0.this.f62691i = (TextView) viewInflate.findViewById(R.id.tv_update);
                    j0.this.f62692j = (TextView) viewInflate.findViewById(R.id.tv_feedback);
                    j0.this.f62687e.setText(em.r.a().getResources().getString(R.string.str_update) + "\n" + updateEvent.getResult().getVersion_name());
                    j0.this.f62688f.setMovementMethod(LinkMovementMethod.getInstance());
                    if (updateEvent.getResult().getForce_upgrade() == 1) {
                        j0.this.f62693k.setVisibility(8);
                        j0.this.f62691i.setVisibility(0);
                    } else {
                        j0.this.f62693k.setVisibility(0);
                        j0.this.f62691i.setVisibility(8);
                    }
                    String str2 = "";
                    if (!em.o.b(updateEvent.getResult().getText())) {
                        for (String str3 : updateEvent.getResult().getText().split("/n")) {
                            str2 = str2 + "\n" + str3;
                        }
                    }
                    if (!em.o.b(str2)) {
                        Matcher matcher = Pattern.compile("(http://|https://).+./").matcher(str2);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                        if (matcher.find()) {
                            spannableStringBuilder.setSpan(new C0559a(matcher.group()), str2.indexOf("http"), str2.lastIndexOf("/") + 1, 33);
                            j0.this.f62688f.setText(spannableStringBuilder);
                        } else {
                            j0.this.f62688f.setText(spannableStringBuilder);
                        }
                    }
                    j0.this.f62697o = gb.h.b(this.f62701d, viewInflate, true);
                    j0.this.f62697o.setCanceledOnTouchOutside(false);
                    j0.this.f62697o.setCancelable(false);
                    j0.this.f62697o.show();
                    j0.this.f62692j.setOnClickListener(new b());
                    j0.this.f62689g.setOnClickListener(new c());
                    j0.this.f62691i.setOnClickListener(new d(updateEvent));
                    j0.this.f62690h.setOnClickListener(new e(updateEvent));
                }
            } catch (PackageManager.NameNotFoundException e10) {
                e10.printStackTrace();
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            this.f62699b = bVar;
        }
    }

    /* JADX INFO: compiled from: UpdateUtil.java */
    public class b implements ii.n<String> {

        /* JADX INFO: compiled from: UpdateUtil.java */
        public class a implements Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ii.m f62712a;

            public a(ii.m mVar) {
                this.f62712a = mVar;
            }

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                Log.i("wangyi", "fail：" + call.toString());
                this.f62712a.onError(iOException);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                Log.i("wangyi", "sucess：" + response.toString());
                if (response.body() != null) {
                    this.f62712a.onNext(response.body().string());
                }
            }
        }

        public b() {
        }

        @Override // ii.n
        public void subscribe(ii.m<String> mVar) throws Exception {
            String str;
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            if (em.o.b(o0.p())) {
                str = n9.b.b() + "api/public/upgrade";
            } else {
                str = o0.p() + "api/public/upgrade";
            }
            MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
            long jCurrentTimeMillis = System.currentTimeMillis();
            Request requestBuild = new Request.Builder().addHeader("app_id", "moviein").addHeader("version", "40000").addHeader("sys_platform", "2").addHeader("mob_mfr", Build.MANUFACTURER.toLowerCase()).addHeader("mobmodel", Build.MODEL).addHeader("sysrelease", Build.VERSION.RELEASE).addHeader("device_id", t9.a.a(em.r.a())).addHeader("channel_code", sa.e.f(BaseApplication.getInstance())).addHeader("cur_time", jCurrentTimeMillis + "").addHeader("token", o0.R()).addHeader("sign", sa.e.x(sa.e.y(jCurrentTimeMillis + "")).toUpperCase()).post(RequestBody.create(mediaType, "")).url(str).build();
            builder.sslSocketFactory(c0.a(), c0.c()).hostnameVerifier(new g());
            builder.build().newCall(requestBuild).enqueue(new a(mVar));
        }
    }

    /* JADX INFO: compiled from: UpdateUtil.java */
    public class c implements ii.r<Integer> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f62714b;

        public c(int i10) {
            this.f62714b = i10;
        }

        @Override // ii.r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Integer num) {
            j0.this.f62685c.setProgress(num.intValue());
            j0.this.f62686d.setText(num + "/100");
            if (num.intValue() == 100) {
                if (this.f62714b == 1) {
                    j0.this.f62691i.setVisibility(0);
                } else {
                    j0.this.f62693k.setVisibility(0);
                }
                j0.this.f62685c.setVisibility(8);
                j0.this.f62686d.setVisibility(8);
                j0.this.f62690h.setEnabled(true);
                j0.this.f62691i.setEnabled(true);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            j0.this.f62684b = bVar;
        }

        @Override // ii.r
        public void onComplete() {
            em.p.b(em.r.a().getResources().getString(R.string.str_download_tfail));
            if (this.f62714b == 1) {
                j0.this.f62691i.setVisibility(0);
            } else {
                j0.this.f62693k.setVisibility(0);
            }
            j0.this.f62685c.setVisibility(8);
            j0.this.f62686d.setVisibility(8);
            j0.this.f62690h.setEnabled(true);
            j0.this.f62691i.setEnabled(true);
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            em.p.b(em.r.a().getResources().getString(R.string.str_download_tfail));
            if (this.f62714b == 1) {
                j0.this.f62691i.setVisibility(0);
            } else {
                j0.this.f62693k.setVisibility(0);
            }
            j0.this.f62685c.setVisibility(8);
            j0.this.f62686d.setVisibility(8);
            j0.this.f62690h.setEnabled(true);
            j0.this.f62691i.setEnabled(true);
        }
    }

    /* JADX INFO: compiled from: UpdateUtil.java */
    public class d implements ii.n<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f62716a;

        public d(String str) {
            this.f62716a = str;
        }

        @Override // ii.n
        public void subscribe(ii.m<Integer> mVar) throws Exception {
            j0.this.F(this.f62716a, mVar);
        }
    }

    /* JADX INFO: compiled from: UpdateUtil.java */
    public class e implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f62718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ii.m f62719b;

        public e(String str, ii.m mVar) {
            this.f62718a = str;
            this.f62719b = mVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            j0.this.C(this.f62718a, this.f62719b);
        }

        /* JADX WARN: Code duplicated, block: B:41:0x0098 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x009a A[Catch: Exception -> 0x0096, TRY_LEAVE, TryCatch #4 {Exception -> 0x0096, blocks: (B:38:0x0092, B:42:0x009a), top: B:46:0x0092 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            FileOutputStream fileOutputStream;
            byte[] bArr = new byte[2048];
            InputStream inputStream = null;
            try {
                try {
                    InputStream inputStreamByteStream = response.body().byteStream();
                    try {
                        File fileD = j0.this.D();
                        fileOutputStream = new FileOutputStream(fileD);
                        try {
                            long jContentLength = response.body().getContentLength();
                            j0.this.f62695m = jContentLength;
                            long j10 = 0;
                            while (true) {
                                int i10 = inputStreamByteStream.read(bArr);
                                if (i10 == -1) {
                                    fileOutputStream.flush();
                                    j0 j0Var = j0.this;
                                    j0Var.G(j0Var.f62683a, fileD);
                                    inputStreamByteStream.close();
                                    fileOutputStream.close();
                                    return;
                                }
                                fileOutputStream.write(bArr, 0, i10);
                                j10 += (long) i10;
                                this.f62719b.onNext(Integer.valueOf((int) (((j10 * 1.0f) / jContentLength) * 100.0f)));
                                j0.this.f62694l = j10;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            inputStream = inputStreamByteStream;
                            try {
                                e.printStackTrace();
                                j0.this.C(this.f62718a, this.f62719b);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                        throw th;
                                    }
                                } else if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = inputStreamByteStream;
                            if (inputStream != null) {
                                inputStream.close();
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            } else if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        fileOutputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        fileOutputStream = null;
                    }
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            } catch (Exception e14) {
                e = e14;
                fileOutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                fileOutputStream = null;
            }
        }
    }

    /* JADX INFO: compiled from: UpdateUtil.java */
    public class f implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f62721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ii.m f62722b;

        public f(String str, ii.m mVar) {
            this.f62721a = str;
            this.f62722b = mVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            j0.this.C(this.f62721a, this.f62722b);
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00d6 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:50:0x00d8 A[Catch: Exception -> 0x00d4, TRY_LEAVE, TryCatch #5 {Exception -> 0x00d4, blocks: (B:46:0x00d0, B:50:0x00d8), top: B:54:0x00d0 }] */
        /* JADX WARN: Code duplicated, block: B:54:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            RandomAccessFile randomAccessFile;
            String absolutePath;
            if (response.body() == null) {
                j0.this.C(this.f62721a, this.f62722b);
                return;
            }
            byte[] bArr = new byte[2048];
            InputStream inputStream = null;
            try {
                try {
                    InputStream inputStreamByteStream = response.body().byteStream();
                    try {
                        if (Environment.getExternalStorageState().equals("mounted")) {
                            absolutePath = BaseApplication.getInstance().getExternalFilesDir("").getAbsolutePath();
                        } else {
                            absolutePath = BaseApplication.getInstance().getFilesDir().getAbsolutePath();
                        }
                        File file = new File(absolutePath, "updateDemo.apk");
                        randomAccessFile = new RandomAccessFile(file, "rwd");
                        try {
                            randomAccessFile.seek(j0.this.f62694l);
                            long j10 = j0.this.f62695m;
                            long j11 = j0.this.f62694l;
                            while (true) {
                                int i10 = inputStreamByteStream.read(bArr);
                                if (i10 != -1) {
                                    randomAccessFile.write(bArr, 0, i10);
                                    j11 += (long) i10;
                                    this.f62722b.onNext(Integer.valueOf((int) (((j11 * 1.0f) / j10) * 100.0f)));
                                    j0.this.f62694l = j11;
                                } else {
                                    j0 j0Var = j0.this;
                                    j0Var.G(j0Var.f62683a, file);
                                    inputStreamByteStream.close();
                                    randomAccessFile.close();
                                    return;
                                }
                            }
                        } catch (Exception e10) {
                            e = e10;
                            inputStream = inputStreamByteStream;
                            try {
                                e.printStackTrace();
                                j0.this.C(this.f62721a, this.f62722b);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                        if (randomAccessFile != null) {
                                            randomAccessFile.close();
                                        }
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                        throw th;
                                    }
                                } else if (randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = inputStreamByteStream;
                            if (inputStream != null) {
                                inputStream.close();
                                if (randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } else if (randomAccessFile != null) {
                                randomAccessFile.close();
                            }
                            throw th;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        randomAccessFile = null;
                    } catch (Throwable th4) {
                        th = th4;
                        randomAccessFile = null;
                    }
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            } catch (Exception e14) {
                e = e14;
                randomAccessFile = null;
            } catch (Throwable th5) {
                th = th5;
                randomAccessFile = null;
            }
        }
    }

    /* JADX INFO: compiled from: UpdateUtil.java */
    public static class g implements HostnameVerifier {
        public g() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    public final void C(String str, ii.m<Integer> mVar) {
        new OkHttpClient().newCall(new Request.Builder().url(str).addHeader("RANGE", "bytes=" + this.f62694l + "-" + this.f62695m).build()).enqueue(new f(str, mVar));
    }

    public void F(String str, ii.m<Integer> mVar) {
        new OkHttpClient().newCall(new Request.Builder().url(str).build()).enqueue(new e(str, mVar));
    }

    public void G(Context context, File file) {
        if (context == null) {
            return;
        }
        Uri uriForFile = FileProvider.getUriForFile(context, BaseApplication.getInstance().getPackageName() + ".fileProvider", file);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.addFlags(3);
        intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
        intent.setClipData(ClipData.newRawUri("output", uriForFile));
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
    }

    public void H(Context context, Activity activity, boolean z10) {
        this.f62683a = context;
        this.f62698p = z10;
        ii.k.create(new b()).subscribeOn(gj.a.b()).observeOn(li.a.a()).subscribe(new a(z10, context));
    }

    public final File D() {
        String absolutePath;
        if (Environment.getExternalStorageState().equals("mounted")) {
            absolutePath = BaseApplication.getInstance().getExternalFilesDir("").getAbsolutePath();
        } else {
            absolutePath = BaseApplication.getInstance().getFilesDir().getAbsolutePath();
        }
        File file = new File(absolutePath, "updatexiaocao.apk");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return file;
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public void E(String str, int i10) {
        if (em.o.b(str)) {
            em.p.b(em.r.a().getResources().getString(R.string.str_download_tfail));
            return;
        }
        this.f62691i.setEnabled(false);
        this.f62690h.setEnabled(false);
        this.f62693k.setVisibility(8);
        this.f62691i.setVisibility(8);
        this.f62685c.setVisibility(0);
        this.f62686d.setVisibility(0);
        ii.k.create(new d(str)).subscribeOn(gj.a.b()).observeOn(li.a.a()).subscribe(new c(i10));
    }
}
