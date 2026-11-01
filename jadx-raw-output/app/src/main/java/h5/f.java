package h5;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import androidx.annotation.Nullable;
import androidx.work.Data;
import com.google.android.exoplayer2.video.VideoDecoderOutputBuffer;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: VideoDecoderRenderer.java */
/* JADX INFO: loaded from: classes6.dex */
public class f implements GLSurfaceView.Renderer, e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f53735l = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float[] f53736m = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float[] f53737n = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f53738o = {"y_tex", "u_tex", "v_tex"};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final FloatBuffer f53739p = g5.k.e(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GLSurfaceView f53740b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f53744f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f53746h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public VideoDecoderOutputBuffer f53749k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f53741c = new int[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<VideoDecoderOutputBuffer> f53742d = new AtomicReference<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FloatBuffer[] f53743e = new FloatBuffer[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f53745g = new int[3];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f53747i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f53748j = new int[3];

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        GLES20.glViewport(0, 0, i10, i11);
    }

    public final void a() {
        GLES20.glGenTextures(3, this.f53741c, 0);
        for (int i10 = 0; i10 < 3; i10++) {
            GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f53744f, f53738o[i10]), i10);
            GLES20.glActiveTexture(33984 + i10);
            GLES20.glBindTexture(3553, this.f53741c[i10]);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, Data.MAX_DATA_BYTES, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
        }
        g5.k.b();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        VideoDecoderOutputBuffer andSet = this.f53742d.getAndSet(null);
        if (andSet == null && this.f53749k == null) {
            return;
        }
        if (andSet != null) {
            VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.f53749k;
            if (videoDecoderOutputBuffer != null) {
                videoDecoderOutputBuffer.release();
            }
            this.f53749k = andSet;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.f53749k;
        float[] fArr = f53736m;
        int i10 = videoDecoderOutputBuffer2.colorspace;
        if (i10 == 1) {
            fArr = f53735l;
        } else if (i10 == 3) {
            fArr = f53737n;
        }
        GLES20.glUniformMatrix3fv(this.f53746h, 1, false, fArr, 0);
        int i11 = 0;
        while (i11 < 3) {
            int i12 = i11 == 0 ? videoDecoderOutputBuffer2.height : (videoDecoderOutputBuffer2.height + 1) / 2;
            GLES20.glActiveTexture(33984 + i11);
            GLES20.glBindTexture(3553, this.f53741c[i11]);
            GLES20.glPixelStorei(3317, 1);
            GLES20.glTexImage2D(3553, 0, 6409, videoDecoderOutputBuffer2.yuvStrides[i11], i12, 0, 6409, 5121, videoDecoderOutputBuffer2.yuvPlanes[i11]);
            i11++;
        }
        int i13 = videoDecoderOutputBuffer2.width;
        int i14 = (i13 + 1) / 2;
        int[] iArr = {i13, i14, i14};
        for (int i15 = 0; i15 < 3; i15++) {
            if (this.f53747i[i15] != iArr[i15] || this.f53748j[i15] != videoDecoderOutputBuffer2.yuvStrides[i15]) {
                g5.a.f(videoDecoderOutputBuffer2.yuvStrides[i15] != 0);
                float f10 = iArr[i15] / videoDecoderOutputBuffer2.yuvStrides[i15];
                this.f53743e[i15] = g5.k.e(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f10, 0.0f, f10, 1.0f});
                GLES20.glVertexAttribPointer(this.f53745g[i15], 2, 5126, false, 0, (Buffer) this.f53743e[i15]);
                this.f53747i[i15] = iArr[i15];
                this.f53748j[i15] = videoDecoderOutputBuffer2.yuvStrides[i15];
            }
        }
        GLES20.glClear(16384);
        GLES20.glDrawArrays(5, 0, 4);
        g5.k.b();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int iC = g5.k.c("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
        this.f53744f = iC;
        GLES20.glUseProgram(iC);
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f53744f, "in_pos");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        GLES20.glVertexAttribPointer(iGlGetAttribLocation, 2, 5126, false, 0, (Buffer) f53739p);
        this.f53745g[0] = GLES20.glGetAttribLocation(this.f53744f, "in_tc_y");
        GLES20.glEnableVertexAttribArray(this.f53745g[0]);
        this.f53745g[1] = GLES20.glGetAttribLocation(this.f53744f, "in_tc_u");
        GLES20.glEnableVertexAttribArray(this.f53745g[1]);
        this.f53745g[2] = GLES20.glGetAttribLocation(this.f53744f, "in_tc_v");
        GLES20.glEnableVertexAttribArray(this.f53745g[2]);
        g5.k.b();
        this.f53746h = GLES20.glGetUniformLocation(this.f53744f, "mColorConversion");
        g5.k.b();
        a();
        g5.k.b();
    }

    public f(GLSurfaceView gLSurfaceView) {
        this.f53740b = gLSurfaceView;
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = this.f53747i;
            this.f53748j[i10] = -1;
            iArr[i10] = -1;
        }
    }
}
