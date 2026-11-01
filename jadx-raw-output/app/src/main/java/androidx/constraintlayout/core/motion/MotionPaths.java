package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import com.ironsource.C3426d4;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class MotionPaths implements Comparable<MotionPaths> {
    public static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    public static final int OFF_HEIGHT = 4;
    public static final int OFF_PATH_ROTATE = 5;
    public static final int OFF_POSITION = 0;
    public static final int OFF_WIDTH = 3;
    public static final int OFF_X = 1;
    public static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    public static final int PERPENDICULAR = 1;
    public static final int SCREEN = 2;
    public static final String TAG = "MotionPaths";
    public static String[] names = {C3426d4.i.L, VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "width", "height", "pathRotate"};
    public HashMap<String, CustomVariable> customAttributes;
    public float height;
    public int mAnimateCircleAngleTo;
    public int mAnimateRelativeTo;
    public int mDrawPath;
    public Easing mKeyFrameEasing;
    public int mMode;
    public int mPathMotionArc;
    public float mPathRotate;
    public float mProgress;
    public float mRelativeAngle;
    public Motion mRelativeToController;
    public double[] mTempDelta;
    public double[] mTempValue;
    public float position;
    public float time;
    public float width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f3772x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f3773y;

    public MotionPaths() {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = -1;
        this.mAnimateRelativeTo = -1;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.customAttributes = new HashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

    private static final float xRotate(float f10, float f11, float f12, float f13, float f14, float f15) {
        return (((f14 - f12) * f11) - ((f15 - f13) * f10)) + f12;
    }

    private static final float yRotate(float f10, float f11, float f12, float f13, float f14, float f15) {
        return ((f14 - f12) * f10) + ((f15 - f13) * f11) + f13;
    }

    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.position, this.f3772x, this.f3773y, this.width, this.height, this.mPathRotate};
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 < 6) {
                dArr[i10] = fArr[i11];
                i10++;
            }
        }
    }

    public void getCenter(double d10, int[] iArr, double[] dArr, float[] fArr, int i10) {
        float fSin = this.f3772x;
        float fCos = this.f3773y;
        float f10 = this.width;
        float f11 = this.height;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f12 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                fSin = f12;
            } else if (i12 == 2) {
                fCos = f12;
            } else if (i12 == 3) {
                f10 = f12;
            } else if (i12 == 4) {
                f11 = f12;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d10, fArr2, new float[2]);
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            double d11 = f13;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) ((d11 + (Math.sin(d13) * d12)) - ((double) (f10 / 2.0f)));
            fCos = (float) ((((double) f14) - (d12 * Math.cos(d13))) - ((double) (f11 / 2.0f)));
        }
        fArr[i10] = fSin + (f10 / 2.0f) + 0.0f;
        fArr[i10 + 1] = fCos + (f11 / 2.0f) + 0.0f;
    }

    public void getCenterVelocity(double d10, int[] iArr, double[] dArr, float[] fArr, int i10) {
        float fSin = this.f3772x;
        float fCos = this.f3773y;
        float f10 = this.width;
        float f11 = this.height;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f12 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                fSin = f12;
            } else if (i12 == 2) {
                fCos = f12;
            } else if (i12 == 3) {
                f10 = f12;
            } else if (i12 == 4) {
                f11 = f12;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d10, fArr2, new float[2]);
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            double d11 = f13;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) ((d11 + (Math.sin(d13) * d12)) - ((double) (f10 / 2.0f)));
            fCos = (float) ((((double) f14) - (d12 * Math.cos(d13))) - ((double) (f11 / 2.0f)));
        }
        fArr[i10] = fSin + (f10 / 2.0f) + 0.0f;
        fArr[i10 + 1] = fCos + (f11 / 2.0f) + 0.0f;
    }

    public void applyParameters(MotionWidget motionWidget) {
        this.mKeyFrameEasing = Easing.getInterpolator(motionWidget.motion.mTransitionEasing);
        MotionWidget.Motion motion = motionWidget.motion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateCircleAngleTo = motion.mAnimateCircleAngleTo;
        this.mProgress = motionWidget.propertySet.mProgress;
        this.mRelativeAngle = 0.0f;
        for (String str : motionWidget.getCustomAttributeNames()) {
            CustomVariable customAttribute = motionWidget.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.customAttributes.put(str, customAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionPaths motionPaths) {
        return Float.compare(this.position, motionPaths.position);
    }

    public void configureRelativeTo(Motion motion) {
        motion.getPos(this.mProgress);
    }

    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z10) {
        boolean zDiff = diff(this.f3772x, motionPaths.f3772x);
        boolean zDiff2 = diff(this.f3773y, motionPaths.f3773y);
        zArr[0] = zArr[0] | diff(this.position, motionPaths.position);
        boolean z11 = zDiff | zDiff2 | z10;
        zArr[1] = zArr[1] | z11;
        zArr[2] = z11 | zArr[2];
        zArr[3] = zArr[3] | diff(this.width, motionPaths.width);
        zArr[4] = diff(this.height, motionPaths.height) | zArr[4];
    }

    public void getBounds(int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f10 = this.width;
        float f11 = this.height;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f12 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 3) {
                f10 = f12;
            } else if (i12 == 4) {
                f11 = f12;
            }
        }
        fArr[i10] = f10;
        fArr[i10 + 1] = f11;
    }

    public int getCustomData(String str, double[] dArr, int i10) {
        CustomVariable customVariable = this.customAttributes.get(str);
        int i11 = 0;
        if (customVariable == null) {
            return 0;
        }
        if (customVariable.numberOfInterpolatedValues() == 1) {
            dArr[i10] = customVariable.getValueToInterpolate();
            return 1;
        }
        int iNumberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
        float[] fArr = new float[iNumberOfInterpolatedValues];
        customVariable.getValuesToInterpolate(fArr);
        while (i11 < iNumberOfInterpolatedValues) {
            dArr[i10] = fArr[i11];
            i11++;
            i10++;
        }
        return iNumberOfInterpolatedValues;
    }

    public int getCustomDataCount(String str) {
        CustomVariable customVariable = this.customAttributes.get(str);
        if (customVariable == null) {
            return 0;
        }
        return customVariable.numberOfInterpolatedValues();
    }

    public void getRect(int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f10 = this.f3772x;
        float fCos = this.f3773y;
        float f11 = this.width;
        float f12 = this.height;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f13 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f10 = f13;
            } else if (i12 == 2) {
                fCos = f13;
            } else if (i12 == 3) {
                f11 = f13;
            } else if (i12 == 4) {
                f12 = f13;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float centerX = motion.getCenterX();
            float centerY = this.mRelativeToController.getCenterY();
            double d10 = f10;
            double d11 = fCos;
            float fSin = (float) ((((double) centerX) + (Math.sin(d11) * d10)) - ((double) (f11 / 2.0f)));
            fCos = (float) ((((double) centerY) - (d10 * Math.cos(d11))) - ((double) (f12 / 2.0f)));
            f10 = fSin;
        }
        float f14 = f11 + f10;
        float f15 = f12 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i13 = i10 + 1;
        fArr[i10] = f10 + 0.0f;
        int i14 = i13 + 1;
        fArr[i13] = fCos + 0.0f;
        int i15 = i14 + 1;
        fArr[i14] = f14 + 0.0f;
        int i16 = i15 + 1;
        fArr[i15] = fCos + 0.0f;
        int i17 = i16 + 1;
        fArr[i16] = f14 + 0.0f;
        int i18 = i17 + 1;
        fArr[i17] = f15 + 0.0f;
        fArr[i18] = f10 + 0.0f;
        fArr[i18 + 1] = f15 + 0.0f;
    }

    public boolean hasCustomData(String str) {
        return this.customAttributes.containsKey(str);
    }

    public void initCartesian(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f10 = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f10;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        float f11 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f10 : motionKeyPosition.mPercentWidth;
        float f12 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f10 : motionKeyPosition.mPercentHeight;
        float f13 = motionPaths2.width;
        float f14 = motionPaths.width;
        float f15 = motionPaths2.height;
        float f16 = motionPaths.height;
        this.position = this.time;
        float f17 = motionPaths.f3772x;
        float f18 = motionPaths.f3773y;
        float f19 = (motionPaths2.f3772x + (f13 / 2.0f)) - ((f14 / 2.0f) + f17);
        float f20 = (motionPaths2.f3773y + (f15 / 2.0f)) - (f18 + (f16 / 2.0f));
        float f21 = (f13 - f14) * f11;
        float f22 = f21 / 2.0f;
        this.f3772x = (int) ((f17 + (f19 * f10)) - f22);
        float f23 = (f15 - f16) * f12;
        float f24 = f23 / 2.0f;
        this.f3773y = (int) ((f18 + (f20 * f10)) - f24);
        this.width = (int) (f14 + f21);
        this.height = (int) (f16 + f23);
        float f25 = Float.isNaN(motionKeyPosition.mPercentX) ? f10 : motionKeyPosition.mPercentX;
        float f26 = Float.isNaN(motionKeyPosition.mAltPercentY) ? 0.0f : motionKeyPosition.mAltPercentY;
        if (!Float.isNaN(motionKeyPosition.mPercentY)) {
            f10 = motionKeyPosition.mPercentY;
        }
        float f27 = Float.isNaN(motionKeyPosition.mAltPercentX) ? 0.0f : motionKeyPosition.mAltPercentX;
        this.mMode = 0;
        this.f3772x = (int) (((motionPaths.f3772x + (f25 * f19)) + (f27 * f20)) - f22);
        this.f3773y = (int) (((motionPaths.f3773y + (f19 * f26)) + (f20 * f10)) - f24);
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    public void initPath(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f10 = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f10;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        float f11 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f10 : motionKeyPosition.mPercentWidth;
        float f12 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f10 : motionKeyPosition.mPercentHeight;
        float f13 = motionPaths2.width - motionPaths.width;
        float f14 = motionPaths2.height - motionPaths.height;
        this.position = this.time;
        if (!Float.isNaN(motionKeyPosition.mPercentX)) {
            f10 = motionKeyPosition.mPercentX;
        }
        float f15 = motionPaths.f3772x;
        float f16 = motionPaths.width;
        float f17 = motionPaths.f3773y;
        float f18 = motionPaths.height;
        float f19 = (motionPaths2.f3772x + (motionPaths2.width / 2.0f)) - ((f16 / 2.0f) + f15);
        float f20 = (motionPaths2.f3773y + (motionPaths2.height / 2.0f)) - ((f18 / 2.0f) + f17);
        float f21 = f19 * f10;
        float f22 = f13 * f11;
        float f23 = f22 / 2.0f;
        this.f3772x = (int) ((f15 + f21) - f23);
        float f24 = f10 * f20;
        float f25 = f14 * f12;
        float f26 = f25 / 2.0f;
        this.f3773y = (int) ((f17 + f24) - f26);
        this.width = (int) (f16 + f22);
        this.height = (int) (f18 + f25);
        float f27 = Float.isNaN(motionKeyPosition.mPercentY) ? 0.0f : motionKeyPosition.mPercentY;
        this.mMode = 1;
        float f28 = (int) ((motionPaths.f3772x + f21) - f23);
        float f29 = (int) ((motionPaths.f3773y + f24) - f26);
        this.f3772x = f28 + ((-f20) * f27);
        this.f3773y = f29 + (f19 * f27);
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    public void initPolar(int i10, int i11, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float fMin;
        float f10;
        float f11 = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f11;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        this.mMode = motionKeyPosition.mPositionType;
        float f12 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f11 : motionKeyPosition.mPercentWidth;
        float f13 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f11 : motionKeyPosition.mPercentHeight;
        float f14 = motionPaths2.width;
        float f15 = motionPaths.width;
        float f16 = motionPaths2.height;
        float f17 = motionPaths.height;
        this.position = this.time;
        this.width = (int) (f15 + ((f14 - f15) * f12));
        this.height = (int) (f17 + ((f16 - f17) * f13));
        int i12 = motionKeyPosition.mPositionType;
        if (i12 == 1) {
            float f18 = Float.isNaN(motionKeyPosition.mPercentX) ? f11 : motionKeyPosition.mPercentX;
            float f19 = motionPaths2.f3772x;
            float f20 = motionPaths.f3772x;
            this.f3772x = (f18 * (f19 - f20)) + f20;
            if (!Float.isNaN(motionKeyPosition.mPercentY)) {
                f11 = motionKeyPosition.mPercentY;
            }
            float f21 = motionPaths2.f3773y;
            float f22 = motionPaths.f3773y;
            this.f3773y = (f11 * (f21 - f22)) + f22;
        } else if (i12 != 2) {
            float f23 = Float.isNaN(motionKeyPosition.mPercentX) ? f11 : motionKeyPosition.mPercentX;
            float f24 = motionPaths2.f3772x;
            float f25 = motionPaths.f3772x;
            this.f3772x = (f23 * (f24 - f25)) + f25;
            if (!Float.isNaN(motionKeyPosition.mPercentY)) {
                f11 = motionKeyPosition.mPercentY;
            }
            float f26 = motionPaths2.f3773y;
            float f27 = motionPaths.f3773y;
            this.f3773y = (f11 * (f26 - f27)) + f27;
        } else {
            if (Float.isNaN(motionKeyPosition.mPercentX)) {
                float f28 = motionPaths2.f3772x;
                float f29 = motionPaths.f3772x;
                fMin = ((f28 - f29) * f11) + f29;
            } else {
                fMin = Math.min(f13, f12) * motionKeyPosition.mPercentX;
            }
            this.f3772x = fMin;
            if (Float.isNaN(motionKeyPosition.mPercentY)) {
                float f30 = motionPaths2.f3773y;
                float f31 = motionPaths.f3773y;
                f10 = (f11 * (f30 - f31)) + f31;
            } else {
                f10 = motionKeyPosition.mPercentY;
            }
            this.f3773y = f10;
        }
        this.mAnimateRelativeTo = motionPaths.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    public void initScreen(int i10, int i11, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f10 = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f10;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        float f11 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f10 : motionKeyPosition.mPercentWidth;
        float f12 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f10 : motionKeyPosition.mPercentHeight;
        float f13 = motionPaths2.width;
        float f14 = motionPaths.width;
        float f15 = motionPaths2.height;
        float f16 = motionPaths.height;
        this.position = this.time;
        float f17 = motionPaths.f3772x;
        float f18 = motionPaths.f3773y;
        float f19 = motionPaths2.f3772x + (f13 / 2.0f);
        float f20 = motionPaths2.f3773y + (f15 / 2.0f);
        float f21 = (f13 - f14) * f11;
        this.f3772x = (int) ((f17 + ((f19 - ((f14 / 2.0f) + f17)) * f10)) - (f21 / 2.0f));
        float f22 = (f15 - f16) * f12;
        this.f3773y = (int) ((f18 + ((f20 - (f18 + (f16 / 2.0f))) * f10)) - (f22 / 2.0f));
        this.width = (int) (f14 + f21);
        this.height = (int) (f16 + f22);
        this.mMode = 2;
        if (!Float.isNaN(motionKeyPosition.mPercentX)) {
            this.f3772x = (int) (motionKeyPosition.mPercentX * ((int) (i10 - this.width)));
        }
        if (!Float.isNaN(motionKeyPosition.mPercentY)) {
            this.f3773y = (int) (motionKeyPosition.mPercentY * ((int) (i11 - this.height)));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    public void setBounds(float f10, float f11, float f12, float f13) {
        this.f3772x = f10;
        this.f3773y = f11;
        this.width = f12;
        this.height = f13;
    }

    public void setDpDt(float f10, float f11, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f16 = (float) dArr[i10];
            double d10 = dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f12 = f16;
            } else if (i11 == 2) {
                f14 = f16;
            } else if (i11 == 3) {
                f13 = f16;
            } else if (i11 == 4) {
                f15 = f16;
            }
        }
        float f17 = f12 - ((0.0f * f13) / 2.0f);
        float f18 = f14 - ((0.0f * f15) / 2.0f);
        fArr[0] = (f17 * (1.0f - f10)) + (((f13 * 1.0f) + f17) * f10) + 0.0f;
        fArr[1] = (f18 * (1.0f - f11)) + (((f15 * 1.0f) + f18) * f11) + 0.0f;
    }

    public void setView(float f10, MotionWidget motionWidget, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f11;
        float f12;
        float f13 = this.f3772x;
        float f14 = this.f3773y;
        float f15 = this.width;
        float f16 = this.height;
        if (iArr.length != 0 && this.mTempValue.length <= iArr[iArr.length - 1]) {
            int i10 = iArr[iArr.length - 1] + 1;
            this.mTempValue = new double[i10];
            this.mTempDelta = new double[i10];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            double[] dArr4 = this.mTempValue;
            int i12 = iArr[i11];
            dArr4[i12] = dArr[i11];
            this.mTempDelta[i12] = dArr2[i11];
        }
        float f17 = Float.NaN;
        int i13 = 0;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        while (true) {
            double[] dArr5 = this.mTempValue;
            if (i13 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i13]) && (dArr3 == null || dArr3[i13] == 0.0d)) {
                f12 = f17;
            } else {
                double d10 = dArr3 != null ? dArr3[i13] : 0.0d;
                if (!Double.isNaN(this.mTempValue[i13])) {
                    d10 = this.mTempValue[i13] + d10;
                }
                f12 = f17;
                float f22 = (float) d10;
                float f23 = (float) this.mTempDelta[i13];
                if (i13 == 1) {
                    f17 = f12;
                    f18 = f23;
                    f13 = f22;
                } else if (i13 == 2) {
                    f17 = f12;
                    f19 = f23;
                    f14 = f22;
                } else if (i13 == 3) {
                    f17 = f12;
                    f20 = f23;
                    f15 = f22;
                } else if (i13 == 4) {
                    f17 = f12;
                    f21 = f23;
                    f16 = f22;
                } else if (i13 == 5) {
                    f17 = f22;
                }
                i13++;
            }
            f17 = f12;
            i13++;
        }
        float f24 = f17;
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motion.getCenter(f10, fArr, fArr2);
            float f25 = fArr[0];
            float f26 = fArr[1];
            float f27 = fArr2[0];
            float f28 = fArr2[1];
            double d11 = f13;
            double d12 = f14;
            float fSin = (float) ((((double) f25) + (Math.sin(d12) * d11)) - ((double) (f15 / 2.0f)));
            f11 = f16;
            float fCos = (float) ((((double) f26) - (Math.cos(d12) * d11)) - ((double) (f16 / 2.0f)));
            double d13 = f18;
            double d14 = f19;
            float fSin2 = (float) (((double) f27) + (Math.sin(d12) * d13) + (Math.cos(d12) * d11 * d14));
            float fCos2 = (float) ((((double) f28) - (d13 * Math.cos(d12))) + (d11 * Math.sin(d12) * d14));
            if (dArr2.length >= 2) {
                dArr2[0] = fSin2;
                dArr2[1] = fCos2;
            }
            if (!Float.isNaN(f24)) {
                motionWidget.setRotationZ((float) (((double) f24) + Math.toDegrees(Math.atan2(fCos2, fSin2))));
            }
            f13 = fSin;
            f14 = fCos;
        } else {
            f11 = f16;
            if (!Float.isNaN(f24)) {
                motionWidget.setRotationZ((float) (((double) 0.0f) + ((double) f24) + Math.toDegrees(Math.atan2(f19 + (f21 / 2.0f), f18 + (f20 / 2.0f)))));
            }
        }
        float f29 = f13 + 0.5f;
        float f30 = f14 + 0.5f;
        motionWidget.layout((int) f29, (int) f30, (int) (f29 + f15), (int) (f30 + f11));
    }

    public void setupRelative(Motion motion, MotionPaths motionPaths) {
        double d10 = ((this.f3772x + (this.width / 2.0f)) - motionPaths.f3772x) - (motionPaths.width / 2.0f);
        double d11 = ((this.f3773y + (this.height / 2.0f)) - motionPaths.f3773y) - (motionPaths.height / 2.0f);
        this.mRelativeToController = motion;
        this.f3772x = (float) Math.hypot(d11, d10);
        if (Float.isNaN(this.mRelativeAngle)) {
            this.f3773y = (float) (Math.atan2(d11, d10) + 1.5707963267948966d);
        } else {
            this.f3773y = (float) Math.toRadians(this.mRelativeAngle);
        }
    }

    private boolean diff(float f10, float f11) {
        if (!Float.isNaN(f10) && !Float.isNaN(f11)) {
            if (Math.abs(f10 - f11) > 1.0E-6f) {
                return true;
            }
            return false;
        }
        if (Float.isNaN(f10) != Float.isNaN(f11)) {
            return true;
        }
        return false;
    }

    public MotionPaths(int i10, int i11, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = -1;
        this.mAnimateRelativeTo = -1;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.customAttributes = new HashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        if (motionPaths.mAnimateRelativeTo != -1) {
            initPolar(i10, i11, motionKeyPosition, motionPaths, motionPaths2);
            return;
        }
        int i12 = motionKeyPosition.mPositionType;
        if (i12 == 1) {
            initPath(motionKeyPosition, motionPaths, motionPaths2);
        } else if (i12 != 2) {
            initCartesian(motionKeyPosition, motionPaths, motionPaths2);
        } else {
            initScreen(i10, i11, motionKeyPosition, motionPaths, motionPaths2);
        }
    }

    public void getCenter(double d10, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f10 = this.f3772x;
        float f11 = this.f3773y;
        float f12 = this.width;
        float f13 = this.height;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f18 = (float) dArr[i10];
            float f19 = (float) dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f10 = f18;
                f14 = f19;
            } else if (i11 == 2) {
                f11 = f18;
                f16 = f19;
            } else if (i11 == 3) {
                f12 = f18;
                f15 = f19;
            } else if (i11 == 4) {
                f13 = f18;
                f17 = f19;
            }
        }
        float f20 = 2.0f;
        float f21 = (f15 / 2.0f) + f14;
        float fCos = (f17 / 2.0f) + f16;
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motion.getCenter(d10, fArr3, fArr4);
            float f22 = fArr3[0];
            float f23 = fArr3[1];
            float f24 = fArr4[0];
            float f25 = fArr4[1];
            double d11 = f10;
            double d12 = f11;
            float fSin = (float) ((((double) f22) + (Math.sin(d12) * d11)) - ((double) (f12 / 2.0f)));
            float fCos2 = (float) ((((double) f23) - (d11 * Math.cos(d12))) - ((double) (f13 / 2.0f)));
            double d13 = f14;
            double d14 = f16;
            float fSin2 = (float) (((double) f24) + (Math.sin(d12) * d13) + (Math.cos(d12) * d14));
            fCos = (float) ((((double) f25) - (d13 * Math.cos(d12))) + (Math.sin(d12) * d14));
            f21 = fSin2;
            f10 = fSin;
            f11 = fCos2;
            f20 = 2.0f;
        }
        fArr[0] = f10 + (f12 / f20) + 0.0f;
        fArr[1] = f11 + (f13 / f20) + 0.0f;
        fArr2[0] = f21;
        fArr2[1] = fCos;
    }
}
