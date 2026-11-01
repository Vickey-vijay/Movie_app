package io.bidmachine.media3.exoplayer.video.spherical;

import io.bidmachine.media3.common.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes5.dex */
public final class Projection {
    public static final int DRAW_MODE_TRIANGLES = 0;
    public static final int DRAW_MODE_TRIANGLES_FAN = 2;
    public static final int DRAW_MODE_TRIANGLES_STRIP = 1;
    public static final int POSITION_COORDS_PER_VERTEX = 3;
    public static final int TEXTURE_COORDS_PER_VERTEX = 2;
    public final Mesh leftMesh;
    public final Mesh rightMesh;
    public final boolean singleMesh;
    public final int stereoMode;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DrawMode {
    }

    public static final class Mesh {
        private final SubMesh[] subMeshes;

        public SubMesh getSubMesh(int i10) {
            return this.subMeshes[i10];
        }

        public int getSubMeshCount() {
            return this.subMeshes.length;
        }

        public Mesh(SubMesh... subMeshArr) {
            this.subMeshes = subMeshArr;
        }
    }

    public static final class SubMesh {
        public static final int VIDEO_TEXTURE_ID = 0;
        public final int mode;
        public final float[] textureCoords;
        public final int textureId;
        public final float[] vertices;

        public int getVertexCount() {
            return this.vertices.length / 3;
        }

        public SubMesh(int i10, float[] fArr, float[] fArr2, int i11) {
            boolean z10;
            this.textureId = i10;
            if (((long) fArr.length) * 2 == ((long) fArr2.length) * 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            Assertions.checkArgument(z10);
            this.vertices = fArr;
            this.textureCoords = fArr2;
            this.mode = i11;
        }
    }

    public Projection(Mesh mesh, int i10) {
        this(mesh, mesh, i10);
    }

    public static Projection createEquirectangular(int i10) {
        return createEquirectangular(50.0f, 36, 72, 180.0f, 360.0f, i10);
    }

    public Projection(Mesh mesh, Mesh mesh2, int i10) {
        this.leftMesh = mesh;
        this.rightMesh = mesh2;
        this.stereoMode = i10;
        this.singleMesh = mesh == mesh2;
    }

    public static Projection createEquirectangular(float f10, int i10, int i11, float f11, float f12, int i12) {
        int i13;
        int i14;
        int i15;
        float[] fArr;
        int i16;
        int i17 = i10;
        int i18 = i11;
        Assertions.checkArgument(f10 > 0.0f);
        Assertions.checkArgument(i17 >= 1);
        Assertions.checkArgument(i18 >= 1);
        Assertions.checkArgument(f11 > 0.0f && f11 <= 180.0f);
        Assertions.checkArgument(f12 > 0.0f && f12 <= 360.0f);
        float radians = (float) Math.toRadians(f11);
        float radians2 = (float) Math.toRadians(f12);
        float f13 = radians / i17;
        float f14 = radians2 / i18;
        int i19 = i18 + 1;
        int i20 = ((i19 * 2) + 2) * i17;
        float[] fArr2 = new float[i20 * 3];
        float[] fArr3 = new float[i20 * 2];
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (i21 < i17) {
            float f15 = radians / 2.0f;
            float f16 = (i21 * f13) - f15;
            int i24 = i21 + 1;
            float f17 = (i24 * f13) - f15;
            int i25 = 0;
            while (i25 < i19) {
                float f18 = f16;
                int i26 = i24;
                int i27 = 0;
                int i28 = 2;
                while (i27 < i28) {
                    float f19 = i25 * f14;
                    float f20 = f14;
                    int i29 = i22 + 1;
                    int i30 = i25;
                    double d10 = f10;
                    float f21 = f13;
                    double d11 = (f19 + 3.1415927f) - (radians2 / 2.0f);
                    int i31 = i27;
                    double d12 = i27 == 0 ? f18 : f17;
                    float[] fArr4 = fArr3;
                    float f22 = f17;
                    fArr2[i22] = -((float) (Math.sin(d11) * d10 * Math.cos(d12)));
                    int i32 = i29 + 1;
                    int i33 = i21;
                    fArr2[i29] = (float) (d10 * Math.sin(d12));
                    int i34 = i32 + 1;
                    fArr2[i32] = (float) (d10 * Math.cos(d11) * Math.cos(d12));
                    int i35 = i23 + 1;
                    fArr4[i23] = f19 / radians2;
                    int i36 = i35 + 1;
                    fArr4[i35] = ((i33 + i31) * f21) / radians;
                    if (i30 == 0 && i31 == 0) {
                        i13 = i11;
                        i14 = i30;
                        i15 = i31;
                    } else {
                        i13 = i11;
                        i14 = i30;
                        i15 = i31;
                        if (i14 != i13 || i15 != 1) {
                            fArr = fArr4;
                            i16 = 2;
                        }
                        i23 = i36;
                        i22 = i34;
                        i27 = i15 + 1;
                        i18 = i13;
                        i25 = i14;
                        fArr3 = fArr;
                        i28 = i16;
                        i21 = i33;
                        i19 = i19;
                        f14 = f20;
                        f13 = f21;
                        f17 = f22;
                    }
                    System.arraycopy(fArr2, i34 - 3, fArr2, i34, 3);
                    i34 += 3;
                    fArr = fArr4;
                    i16 = 2;
                    System.arraycopy(fArr, i36 - 2, fArr, i36, 2);
                    i36 += 2;
                    i23 = i36;
                    i22 = i34;
                    i27 = i15 + 1;
                    i18 = i13;
                    i25 = i14;
                    fArr3 = fArr;
                    i28 = i16;
                    i21 = i33;
                    i19 = i19;
                    f14 = f20;
                    f13 = f21;
                    f17 = f22;
                }
                float f23 = f13;
                int i37 = i25;
                int i38 = i18;
                int i39 = i37 + 1;
                f16 = f18;
                i24 = i26;
                i19 = i19;
                f13 = f23;
                f17 = f17;
                i18 = i38;
                i25 = i39;
            }
            i17 = i10;
            i21 = i24;
        }
        return new Projection(new Mesh(new SubMesh(0, fArr2, fArr3, 1)), i12);
    }
}
