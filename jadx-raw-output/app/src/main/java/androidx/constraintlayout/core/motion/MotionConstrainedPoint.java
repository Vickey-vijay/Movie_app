package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.Rect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.Utils;
import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes10.dex */
class MotionConstrainedPoint implements Comparable<MotionConstrainedPoint> {
    public static final int CARTESIAN = 2;
    public static final boolean DEBUG = false;
    public static final int PERPENDICULAR = 1;
    public static final String TAG = "MotionPaths";
    public static String[] names = {C3426d4.i.L, VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "width", "height", "pathRotate"};
    private float height;
    private Easing mKeyFrameEasing;
    private float position;
    public int visibility;
    private float width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f3770x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f3771y;
    private float alpha = 1.0f;
    public int mVisibilityMode = 0;
    private boolean applyElevation = false;
    private float elevation = 0.0f;
    private float rotation = 0.0f;
    private float rotationX = 0.0f;
    public float rotationY = 0.0f;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float mPivotX = Float.NaN;
    private float mPivotY = Float.NaN;
    private float translationX = 0.0f;
    private float translationY = 0.0f;
    private float translationZ = 0.0f;
    private int mDrawPath = 0;
    private float mPathRotate = Float.NaN;
    private float mProgress = Float.NaN;
    private int mAnimateRelativeTo = -1;
    public LinkedHashMap<String, CustomVariable> mCustomVariable = new LinkedHashMap<>();
    public int mMode = 0;
    public double[] mTempValue = new double[18];
    public double[] mTempDelta = new double[18];

    public void different(MotionConstrainedPoint motionConstrainedPoint, HashSet<String> hashSet) {
        if (diff(this.alpha, motionConstrainedPoint.alpha)) {
            hashSet.add("alpha");
        }
        if (diff(this.elevation, motionConstrainedPoint.elevation)) {
            hashSet.add("translationZ");
        }
        int i10 = this.visibility;
        int i11 = motionConstrainedPoint.visibility;
        if (i10 != i11 && this.mVisibilityMode == 0 && (i10 == 4 || i11 == 4)) {
            hashSet.add("alpha");
        }
        if (diff(this.rotation, motionConstrainedPoint.rotation)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.mPathRotate) || !Float.isNaN(motionConstrainedPoint.mPathRotate)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.mProgress) || !Float.isNaN(motionConstrainedPoint.mProgress)) {
            hashSet.add("progress");
        }
        if (diff(this.rotationX, motionConstrainedPoint.rotationX)) {
            hashSet.add("rotationX");
        }
        if (diff(this.rotationY, motionConstrainedPoint.rotationY)) {
            hashSet.add("rotationY");
        }
        if (diff(this.mPivotX, motionConstrainedPoint.mPivotX)) {
            hashSet.add("pivotX");
        }
        if (diff(this.mPivotY, motionConstrainedPoint.mPivotY)) {
            hashSet.add("pivotY");
        }
        if (diff(this.scaleX, motionConstrainedPoint.scaleX)) {
            hashSet.add("scaleX");
        }
        if (diff(this.scaleY, motionConstrainedPoint.scaleY)) {
            hashSet.add("scaleY");
        }
        if (diff(this.translationX, motionConstrainedPoint.translationX)) {
            hashSet.add("translationX");
        }
        if (diff(this.translationY, motionConstrainedPoint.translationY)) {
            hashSet.add("translationY");
        }
        if (diff(this.translationZ, motionConstrainedPoint.translationZ)) {
            hashSet.add("translationZ");
        }
        if (diff(this.elevation, motionConstrainedPoint.elevation)) {
            hashSet.add("elevation");
        }
    }

    public void setState(MotionWidget motionWidget) {
        setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        applyParameters(motionWidget);
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionConstrainedPoint motionConstrainedPoint) {
        return Float.compare(this.position, motionConstrainedPoint.position);
    }

    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.position, this.f3770x, this.f3771y, this.width, this.height, this.alpha, this.elevation, this.rotation, this.rotationX, this.rotationY, this.scaleX, this.scaleY, this.mPivotX, this.mPivotY, this.translationX, this.translationY, this.translationZ, this.mPathRotate};
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 < 18) {
                dArr[i10] = fArr[i11];
                i10++;
            }
        }
    }

    public int getCustomData(String str, double[] dArr, int i10) {
        CustomVariable customVariable = this.mCustomVariable.get(str);
        if (customVariable.numberOfInterpolatedValues() == 1) {
            dArr[i10] = customVariable.getValueToInterpolate();
            return 1;
        }
        int iNumberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
        float[] fArr = new float[iNumberOfInterpolatedValues];
        customVariable.getValuesToInterpolate(fArr);
        int i11 = 0;
        while (i11 < iNumberOfInterpolatedValues) {
            dArr[i10] = fArr[i11];
            i11++;
            i10++;
        }
        return iNumberOfInterpolatedValues;
    }

    public int getCustomDataCount(String str) {
        return this.mCustomVariable.get(str).numberOfInterpolatedValues();
    }

    public boolean hasCustomData(String str) {
        return this.mCustomVariable.containsKey(str);
    }

    public void setBounds(float f10, float f11, float f12, float f13) {
        this.f3770x = f10;
        this.f3771y = f11;
        this.width = f12;
        this.height = f13;
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void addValues(HashMap<String, SplineSet> map, int i10) {
        for (String str : map.keySet()) {
            SplineSet splineSet = map.get(str);
            str.hashCode();
            byte b10 = -1;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        b10 = 0;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        b10 = 1;
                    }
                    break;
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        b10 = 2;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        b10 = 3;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        b10 = 4;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        b10 = 5;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        b10 = 6;
                    }
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        b10 = 7;
                    }
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        b10 = 8;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        b10 = 9;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        b10 = 10;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        b10 = 11;
                    }
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        b10 = 12;
                    }
                    break;
            }
            float f10 = 1.0f;
            float f11 = 0.0f;
            switch (b10) {
                case 0:
                    if (!Float.isNaN(this.rotationX)) {
                        f11 = this.rotationX;
                    }
                    splineSet.setPoint(i10, f11);
                    break;
                case 1:
                    if (!Float.isNaN(this.rotationY)) {
                        f11 = this.rotationY;
                    }
                    splineSet.setPoint(i10, f11);
                    break;
                case 2:
                    if (!Float.isNaN(this.rotation)) {
                        f11 = this.rotation;
                    }
                    splineSet.setPoint(i10, f11);
                    break;
                case 3:
                    if (!Float.isNaN(this.translationX)) {
                        f11 = this.translationX;
                    }
                    splineSet.setPoint(i10, f11);
                    break;
                case 4:
                    if (!Float.isNaN(this.translationY)) {
                        f11 = this.translationY;
                    }
                    splineSet.setPoint(i10, f11);
                    break;
                case 5:
                    if (!Float.isNaN(this.translationZ)) {
                        f11 = this.translationZ;
                    }
                    splineSet.setPoint(i10, f11);
                    break;
                case 6:
                    if (!Float.isNaN(this.mProgress)) {
                        f11 = this.mProgress;
                    }
                    splineSet.setPoint(i10, f11);
                    break;
                case 7:
                    if (!Float.isNaN(this.mPivotX)) {
                        f11 = this.mPivotX;
                    }
                    splineSet.setPoint(i10, f11);
                    break;
                case 8:
                    if (!Float.isNaN(this.mPivotY)) {
                        f11 = this.mPivotY;
                    }
                    splineSet.setPoint(i10, f11);
                    break;
                case 9:
                    if (!Float.isNaN(this.scaleX)) {
                        f10 = this.scaleX;
                    }
                    splineSet.setPoint(i10, f10);
                    break;
                case 10:
                    if (!Float.isNaN(this.scaleY)) {
                        f10 = this.scaleY;
                    }
                    splineSet.setPoint(i10, f10);
                    break;
                case 11:
                    if (!Float.isNaN(this.alpha)) {
                        f10 = this.alpha;
                    }
                    splineSet.setPoint(i10, f10);
                    break;
                case 12:
                    if (!Float.isNaN(this.mPathRotate)) {
                        f11 = this.mPathRotate;
                    }
                    splineSet.setPoint(i10, f11);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(StringUtils.COMMA)[1];
                        if (this.mCustomVariable.containsKey(str2)) {
                            CustomVariable customVariable = this.mCustomVariable.get(str2);
                            if (splineSet instanceof SplineSet.CustomSpline) {
                                ((SplineSet.CustomSpline) splineSet).setPoint(i10, customVariable);
                            } else {
                                Utils.loge("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i10 + ", value" + customVariable.getValueToInterpolate() + splineSet);
                            }
                        }
                    } else {
                        Utils.loge("MotionPaths", "UNKNOWN spline " + str);
                    }
                    break;
            }
        }
    }

    public void applyParameters(MotionWidget motionWidget) {
        float alpha;
        this.visibility = motionWidget.getVisibility();
        if (motionWidget.getVisibility() != 4) {
            alpha = 0.0f;
        } else {
            alpha = motionWidget.getAlpha();
        }
        this.alpha = alpha;
        this.applyElevation = false;
        this.rotation = motionWidget.getRotationZ();
        this.rotationX = motionWidget.getRotationX();
        this.rotationY = motionWidget.getRotationY();
        this.scaleX = motionWidget.getScaleX();
        this.scaleY = motionWidget.getScaleY();
        this.mPivotX = motionWidget.getPivotX();
        this.mPivotY = motionWidget.getPivotY();
        this.translationX = motionWidget.getTranslationX();
        this.translationY = motionWidget.getTranslationY();
        this.translationZ = motionWidget.getTranslationZ();
        for (String str : motionWidget.getCustomAttributeNames()) {
            CustomVariable customAttribute = motionWidget.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.mCustomVariable.put(str, customAttribute);
            }
        }
    }

    public void setState(Rect rect, MotionWidget motionWidget, int i10, float f10) {
        setBounds(rect.left, rect.f3779top, rect.width(), rect.height());
        applyParameters(motionWidget);
        this.mPivotX = Float.NaN;
        this.mPivotY = Float.NaN;
        if (i10 == 1) {
            this.rotation = f10 - 90.0f;
        } else {
            if (i10 != 2) {
                return;
            }
            this.rotation = f10 + 90.0f;
        }
    }

    public void different(MotionConstrainedPoint motionConstrainedPoint, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | diff(this.position, motionConstrainedPoint.position);
        zArr[1] = zArr[1] | diff(this.f3770x, motionConstrainedPoint.f3770x);
        zArr[2] = zArr[2] | diff(this.f3771y, motionConstrainedPoint.f3771y);
        zArr[3] = zArr[3] | diff(this.width, motionConstrainedPoint.width);
        zArr[4] = diff(this.height, motionConstrainedPoint.height) | zArr[4];
    }
}
