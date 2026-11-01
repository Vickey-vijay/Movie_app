package yads;

import android.opengl.GLES20;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class rz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pz0[] f82472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qz0[] f82473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f82474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f82475e;

    public static void a(int i10, int i11, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            ih1.b("GlUtil", GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str);
        }
        GLES20.glAttachShader(i10, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        sz0.a();
    }

    public rz0() {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f82471a = iGlCreateProgram;
        sz0.a();
        a(iGlCreateProgram, 35633, "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n");
        a(iGlCreateProgram, 35632, "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            sz0.a("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        }
        GLES20.glUseProgram(iGlCreateProgram);
        this.f82474d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f82472b = new pz0[iArr2[0]];
        for (int i10 = 0; i10 < iArr2[0]; i10++) {
            pz0 pz0VarA = pz0.a(this.f82471a, i10);
            this.f82472b[i10] = pz0VarA;
            this.f82474d.put(pz0VarA.f81659a, pz0VarA);
        }
        this.f82475e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f82471a, 35718, iArr3, 0);
        this.f82473c = new qz0[iArr3[0]];
        for (int i11 = 0; i11 < iArr3[0]; i11++) {
            qz0 qz0VarA = qz0.a(this.f82471a, i11);
            this.f82473c[i11] = qz0VarA;
            this.f82475e.put(qz0VarA.f82042a, qz0VarA);
        }
        sz0.a();
    }

    public final int a(String str) {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f82471a, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        sz0.a();
        return iGlGetAttribLocation;
    }
}
