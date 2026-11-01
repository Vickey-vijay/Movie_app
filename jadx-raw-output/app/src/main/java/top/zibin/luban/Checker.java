package top.zibin.luban;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import wo.d;

/* JADX INFO: loaded from: classes11.dex */
public enum Checker {
    SINGLE;

    private final byte[] JPEG_SIGNATURE = {-1, -40, -1};

    public final int a(byte[] bArr) {
        int i10;
        int i11;
        if (bArr == null) {
            return 0;
        }
        int i12 = 0;
        while (true) {
            if (i12 + 3 >= bArr.length) {
                i10 = 0;
                break;
            }
            int i13 = i12 + 1;
            if ((bArr[i12] & 255) == 255) {
                int i14 = bArr[i13] & 255;
                if (i14 != 255) {
                    i13++;
                    if (i14 != 216 && i14 != 1) {
                        if (i14 != 217 && i14 != 218) {
                            int iC = c(bArr, i13, 2, false);
                            if (iC >= 2 && (i11 = i13 + iC) <= bArr.length) {
                                if (i14 == 225 && iC >= 8 && c(bArr, i13 + 2, 4, false) == 1165519206 && c(bArr, i13 + 6, 2, false) == 0) {
                                    i12 = i13 + 8;
                                    i10 = iC - 8;
                                    break;
                                }
                                i12 = i11;
                            } else {
                                Log.e("Luban", "Invalid length");
                                return 0;
                            }
                        }
                    }
                }
                i12 = i13;
            }
            i10 = 0;
            i12 = i13;
            break;
        }
        if (i10 > 8) {
            int iC2 = c(bArr, i12, 4, false);
            if (iC2 != 1229531648 && iC2 != 1296891946) {
                Log.e("Luban", "Invalid byte order");
                return 0;
            }
            boolean z10 = iC2 == 1229531648;
            int iC3 = c(bArr, i12 + 4, 4, z10) + 2;
            if (iC3 < 10 || iC3 > i10) {
                Log.e("Luban", "Invalid offset");
                return 0;
            }
            int i15 = i12 + iC3;
            int i16 = i10 - iC3;
            int iC4 = c(bArr, i15 - 2, 2, z10);
            while (true) {
                int i17 = iC4 - 1;
                if (iC4 <= 0 || i16 < 12) {
                    break;
                }
                if (c(bArr, i15, 2, z10) == 274) {
                    int iC5 = c(bArr, i15 + 8, 2, z10);
                    if (iC5 == 1) {
                        return 0;
                    }
                    if (iC5 == 3) {
                        return BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                    }
                    if (iC5 == 6) {
                        return 90;
                    }
                    if (iC5 == 8) {
                        return 270;
                    }
                    Log.e("Luban", "Unsupported orientation");
                    return 0;
                }
                i15 += 12;
                i16 -= 12;
                iC4 = i17;
            }
        }
        Log.e("Luban", "Orientation not found");
        return 0;
    }

    public final boolean b(byte[] bArr) {
        if (bArr == null || bArr.length < 3) {
            return false;
        }
        return Arrays.equals(this.JPEG_SIGNATURE, new byte[]{bArr[0], bArr[1], bArr[2]});
    }

    public final byte[] d(InputStream inputStream) {
        if (inputStream == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                try {
                    int i10 = inputStream.read(bArr, 0, 4096);
                    if (i10 != -1) {
                        byteArrayOutputStream.write(bArr, 0, i10);
                    } else {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused2) {
                    }
                    throw th2;
                }
            } catch (Exception unused3) {
                byte[] bArr2 = new byte[0];
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused4) {
                }
                return bArr2;
            }
        }
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public boolean needCompress(int i10, String str) {
        if (i10 <= 0) {
            return true;
        }
        File file = new File(str);
        return file.exists() && file.length() > (((long) i10) << 10);
    }

    public final int c(byte[] bArr, int i10, int i11, boolean z10) {
        int i12;
        if (z10) {
            i10 += i11 - 1;
            i12 = -1;
        } else {
            i12 = 1;
        }
        int i13 = 0;
        while (true) {
            int i14 = i11 - 1;
            if (i11 <= 0) {
                return i13;
            }
            i13 = (bArr[i10] & 255) | (i13 << 8);
            i10 += i12;
            i11 = i14;
        }
    }

    public String extSuffix(d dVar) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(dVar.open(), null, options);
            return options.outMimeType.replace("image/", ".");
        } catch (Exception unused) {
            return ".jpg";
        }
    }

    Checker() {
    }

    public static boolean isContent(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("content://");
    }

    public int getOrientation(InputStream inputStream) {
        return a(d(inputStream));
    }

    public boolean isJPG(InputStream inputStream) {
        return b(d(inputStream));
    }
}
