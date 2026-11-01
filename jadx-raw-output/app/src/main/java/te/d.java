package te;

import android.annotation.SuppressLint;
import android.hardware.Camera;
import android.util.Log;

/* JADX INFO: compiled from: OpenCameraInterface.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f72371a = "te.d";

    public static Camera a() {
        return b(-1);
    }

    @SuppressLint({"NewApi"})
    public static Camera b(int i10) {
        boolean z10;
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w(f72371a, "No cameras!");
            return null;
        }
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i10 = 0;
            while (i10 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i10, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i10++;
            }
        }
        if (i10 < numberOfCameras) {
            Log.i(f72371a, "Opening camera #" + i10);
            return Camera.open(i10);
        }
        if (z10) {
            Log.w(f72371a, "Requested camera does not exist: " + i10);
            return null;
        }
        Log.i(f72371a, "No camera facing back; returning camera #0");
        return Camera.open(0);
    }
}
