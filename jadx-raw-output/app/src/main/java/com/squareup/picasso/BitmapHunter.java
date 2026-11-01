package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.NetworkInfo;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;

/* JADX INFO: loaded from: classes9.dex */
class BitmapHunter implements Runnable {
    public Action action;
    public List<Action> actions;
    public final Cache cache;
    public final Request data;
    public final Dispatcher dispatcher;
    public Exception exception;
    public int exifOrientation;
    public Future<?> future;
    public final String key;
    public Picasso.LoadedFrom loadedFrom;
    public final int memoryPolicy;
    public int networkPolicy;
    public final Picasso picasso;
    public Picasso.Priority priority;
    public final RequestHandler requestHandler;
    public Bitmap result;
    public int retryCount;
    public final int sequence = SEQUENCE_GENERATOR.incrementAndGet();
    public final Stats stats;
    private static final Object DECODE_LOCK = new Object();
    private static final ThreadLocal<StringBuilder> NAME_BUILDER = new ThreadLocal<StringBuilder>() { // from class: com.squareup.picasso.BitmapHunter.1
        @Override // java.lang.ThreadLocal
        public StringBuilder initialValue() {
            return new StringBuilder(Utils.THREAD_PREFIX);
        }
    };
    private static final AtomicInteger SEQUENCE_GENERATOR = new AtomicInteger();
    private static final RequestHandler ERRORING_HANDLER = new RequestHandler() { // from class: com.squareup.picasso.BitmapHunter.2
        @Override // com.squareup.picasso.RequestHandler
        public boolean canHandleRequest(Request request) {
            return true;
        }

        @Override // com.squareup.picasso.RequestHandler
        public RequestHandler.Result load(Request request, int i10) throws IOException {
            throw new IllegalStateException("Unrecognized type of request: " + request);
        }
    };

    public static int getExifRotation(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return BaseTransientBottomBar.ANIMATION_FADE_DURATION;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static int getExifTranslation(int i10) {
        return (i10 == 2 || i10 == 7 || i10 == 4 || i10 == 5) ? -1 : 1;
    }

    private static boolean shouldResize(boolean z10, int i10, int i11, int i12, int i13) {
        return !z10 || (i12 != 0 && i10 > i12) || (i13 != 0 && i11 > i13);
    }

    private Picasso.Priority computeNewPriority() {
        Picasso.Priority priority = Picasso.Priority.LOW;
        List<Action> list = this.actions;
        boolean z10 = true;
        boolean z11 = (list == null || list.isEmpty()) ? false : true;
        Action action = this.action;
        if (action == null && !z11) {
            z10 = false;
        }
        if (!z10) {
            return priority;
        }
        if (action != null) {
            priority = action.getPriority();
        }
        if (z11) {
            int size = this.actions.size();
            for (int i10 = 0; i10 < size; i10++) {
                Picasso.Priority priority2 = this.actions.get(i10).getPriority();
                if (priority2.ordinal() > priority.ordinal()) {
                    priority = priority2;
                }
            }
        }
        return priority;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x024b  */
    /* JADX WARN: Code duplicated, block: B:92:0x024f  */
    public static Bitmap transformResult(Request request, Bitmap bitmap, int i10) {
        Matrix matrix;
        int i11;
        int i12;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i13;
        int i14;
        float f18;
        float f19;
        float f20;
        int i15;
        int i16;
        float f21;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Bitmap bitmapCreateBitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z10 = request.onlyScaleDown;
        Matrix matrix2 = new Matrix();
        if (request.needsMatrixTransform() || i10 != 0) {
            int iFloor = request.targetWidth;
            int iFloor2 = request.targetHeight;
            float f22 = request.rotationDegrees;
            if (f22 != 0.0f) {
                double d10 = f22;
                double dCos = Math.cos(Math.toRadians(d10));
                double dSin = Math.sin(Math.toRadians(d10));
                if (request.hasRotationPivot) {
                    matrix2.setRotate(f22, request.rotationPivotX, request.rotationPivotY);
                    float f23 = request.rotationPivotX;
                    double d11 = 1.0d - dCos;
                    float f24 = request.rotationPivotY;
                    double d12 = (((double) f23) * d11) + (((double) f24) * dSin);
                    double d13 = (((double) f24) * d11) - (((double) f23) * dSin);
                    int i25 = request.targetWidth;
                    double d14 = (((double) i25) * dCos) + d12;
                    double d15 = (((double) i25) * dSin) + d13;
                    int i26 = request.targetHeight;
                    double d16 = (d12 + (((double) i25) * dCos)) - (((double) i26) * dSin);
                    double d17 = (((double) i25) * dSin) + d13 + (((double) i26) * dCos);
                    double d18 = d12 - (((double) i26) * dSin);
                    double d19 = (((double) i26) * dCos) + d13;
                    double dMax = Math.max(d18, Math.max(d16, Math.max(d12, d14)));
                    double dMin = Math.min(d18, Math.min(d16, Math.min(d12, d14)));
                    double dMax2 = Math.max(d19, Math.max(d17, Math.max(d13, d15)));
                    double dMin2 = Math.min(d19, Math.min(d17, Math.min(d13, d15)));
                    iFloor = (int) Math.floor(dMax - dMin);
                    iFloor2 = (int) Math.floor(dMax2 - dMin2);
                    matrix = matrix2;
                } else {
                    matrix = matrix2;
                    matrix.setRotate(f22);
                    int i27 = request.targetWidth;
                    double d20 = ((double) i27) * dCos;
                    double d21 = ((double) i27) * dSin;
                    int i28 = request.targetHeight;
                    double d22 = (((double) i27) * dCos) - (((double) i28) * dSin);
                    double d23 = (((double) i27) * dSin) + (((double) i28) * dCos);
                    double d24 = -(((double) i28) * dSin);
                    double d25 = ((double) i28) * dCos;
                    double dMax3 = Math.max(d24, Math.max(d22, Math.max(0.0d, d20)));
                    double dMin3 = Math.min(d24, Math.min(d22, Math.min(0.0d, d20)));
                    double dMax4 = Math.max(d25, Math.max(d23, Math.max(0.0d, d21)));
                    double dMin4 = Math.min(d25, Math.min(d23, Math.min(0.0d, d21)));
                    int iFloor3 = (int) Math.floor(dMax3 - dMin3);
                    iFloor2 = (int) Math.floor(dMax4 - dMin4);
                    iFloor = iFloor3;
                }
            } else {
                matrix = matrix2;
            }
            if (i10 != 0) {
                int exifRotation = getExifRotation(i10);
                int exifTranslation = getExifTranslation(i10);
                if (exifRotation != 0) {
                    matrix.preRotate(exifRotation);
                    if (exifRotation == 90 || exifRotation == 270) {
                        int i29 = iFloor2;
                        iFloor2 = iFloor;
                        iFloor = i29;
                    }
                }
                if (exifTranslation != 1) {
                    matrix.postScale(exifTranslation, 1.0f);
                }
            }
            if (request.centerCrop) {
                if (iFloor != 0) {
                    i13 = width;
                    f18 = iFloor / i13;
                    i14 = height;
                } else {
                    i13 = width;
                    i14 = height;
                    f18 = iFloor2 / i14;
                }
                if (iFloor2 != 0) {
                    f19 = iFloor2;
                    f20 = i14;
                } else {
                    f19 = iFloor;
                    f20 = i13;
                }
                float f25 = f19 / f20;
                if (f18 > f25) {
                    int iCeil = (int) Math.ceil(i14 * (f25 / f18));
                    int i30 = request.centerCropGravity;
                    if ((i30 & 48) == 48) {
                        i24 = 0;
                    } else {
                        i24 = (i30 & 80) == 80 ? i14 - iCeil : (i14 - iCeil) / 2;
                    }
                    f21 = iFloor2 / iCeil;
                    i16 = iCeil;
                    i18 = 0;
                    i17 = i24;
                    i15 = i13;
                } else if (f18 < f25) {
                    int iCeil2 = (int) Math.ceil(i13 * (f18 / f25));
                    int i31 = request.centerCropGravity;
                    if ((i31 & 3) == 3) {
                        i19 = 0;
                    } else {
                        i19 = (i31 & 5) == 5 ? i13 - iCeil2 : (i13 - iCeil2) / 2;
                    }
                    i18 = i19;
                    i15 = iCeil2;
                    i16 = i14;
                    f18 = iFloor / iCeil2;
                    f21 = f25;
                    i17 = 0;
                } else {
                    i15 = i13;
                    i16 = i14;
                    f18 = f25;
                    f21 = f18;
                    i17 = 0;
                    i18 = 0;
                }
                if (shouldResize(z10, i13, i14, iFloor, iFloor2)) {
                    matrix.preScale(f18, f21);
                }
                i20 = i17;
                i21 = i16;
                i22 = i18;
                i23 = i15;
            } else {
                i11 = height;
                i12 = width;
                if (request.centerInside) {
                    if (iFloor != 0) {
                        f14 = iFloor;
                        f15 = i12;
                    } else {
                        f14 = iFloor2;
                        f15 = i11;
                    }
                    float f26 = f14 / f15;
                    if (iFloor2 != 0) {
                        f16 = iFloor2;
                        f17 = i11;
                    } else {
                        f16 = iFloor;
                        f17 = i12;
                    }
                    float f27 = f16 / f17;
                    if (f26 >= f27) {
                        f26 = f27;
                    }
                    if (shouldResize(z10, i12, i11, iFloor, iFloor2)) {
                        matrix.preScale(f26, f26);
                    }
                } else if ((iFloor != 0 || iFloor2 != 0) && (iFloor != i12 || iFloor2 != i11)) {
                    if (iFloor != 0) {
                        f10 = iFloor;
                        f11 = i12;
                    } else {
                        f10 = iFloor2;
                        f11 = i11;
                    }
                    float f28 = f10 / f11;
                    if (iFloor2 != 0) {
                        f12 = iFloor2;
                        f13 = i11;
                    } else {
                        f12 = iFloor;
                        f13 = i12;
                    }
                    float f29 = f12 / f13;
                    if (shouldResize(z10, i12, i11, iFloor, iFloor2)) {
                        matrix.preScale(f28, f29);
                    }
                }
            }
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i22, i20, i23, i21, matrix, true);
            if (bitmapCreateBitmap != bitmap) {
                return bitmap;
            }
            bitmap.recycle();
            return bitmapCreateBitmap;
        }
        i12 = width;
        i11 = height;
        matrix = matrix2;
        i23 = i12;
        i21 = i11;
        i22 = 0;
        i20 = 0;
        bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i22, i20, i23, i21, matrix, true);
        if (bitmapCreateBitmap != bitmap) {
            return bitmap;
        }
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    public void attach(Action action) {
        boolean z10 = this.picasso.loggingEnabled;
        Request request = action.request;
        if (this.action == null) {
            this.action = action;
            if (z10) {
                List<Action> list = this.actions;
                if (list == null || list.isEmpty()) {
                    Utils.log(Utils.OWNER_HUNTER, Utils.VERB_JOINED, request.logId(), "to empty hunter");
                    return;
                } else {
                    Utils.log(Utils.OWNER_HUNTER, Utils.VERB_JOINED, request.logId(), Utils.getLogIdsForHunter(this, "to "));
                    return;
                }
            }
            return;
        }
        if (this.actions == null) {
            this.actions = new ArrayList(3);
        }
        this.actions.add(action);
        if (z10) {
            Utils.log(Utils.OWNER_HUNTER, Utils.VERB_JOINED, request.logId(), Utils.getLogIdsForHunter(this, "to "));
        }
        Picasso.Priority priority = action.getPriority();
        if (priority.ordinal() > this.priority.ordinal()) {
            this.priority = priority;
        }
    }

    public boolean cancel() {
        Future<?> future;
        if (this.action != null) {
            return false;
        }
        List<Action> list = this.actions;
        return (list == null || list.isEmpty()) && (future = this.future) != null && future.cancel(false);
    }

    public void detach(Action action) {
        boolean zRemove;
        if (this.action == action) {
            this.action = null;
            zRemove = true;
        } else {
            List<Action> list = this.actions;
            zRemove = list != null ? list.remove(action) : false;
        }
        if (zRemove && action.getPriority() == this.priority) {
            this.priority = computeNewPriority();
        }
        if (this.picasso.loggingEnabled) {
            Utils.log(Utils.OWNER_HUNTER, Utils.VERB_REMOVED, action.request.logId(), Utils.getLogIdsForHunter(this, "from "));
        }
    }

    public Action getAction() {
        return this.action;
    }

    public List<Action> getActions() {
        return this.actions;
    }

    public Request getData() {
        return this.data;
    }

    public Exception getException() {
        return this.exception;
    }

    public String getKey() {
        return this.key;
    }

    public Picasso.LoadedFrom getLoadedFrom() {
        return this.loadedFrom;
    }

    public int getMemoryPolicy() {
        return this.memoryPolicy;
    }

    public Picasso getPicasso() {
        return this.picasso;
    }

    public Picasso.Priority getPriority() {
        return this.priority;
    }

    public Bitmap getResult() {
        return this.result;
    }

    public Bitmap hunt() throws IOException {
        Bitmap bitmapTransformResult;
        if (MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy)) {
            bitmapTransformResult = this.cache.get(this.key);
            if (bitmapTransformResult != null) {
                this.stats.dispatchCacheHit();
                this.loadedFrom = Picasso.LoadedFrom.MEMORY;
                if (this.picasso.loggingEnabled) {
                    Utils.log(Utils.OWNER_HUNTER, Utils.VERB_DECODED, this.data.logId(), "from cache");
                }
                return bitmapTransformResult;
            }
        } else {
            bitmapTransformResult = null;
        }
        int i10 = this.retryCount == 0 ? NetworkPolicy.OFFLINE.index : this.networkPolicy;
        this.networkPolicy = i10;
        RequestHandler.Result resultLoad = this.requestHandler.load(this.data, i10);
        if (resultLoad != null) {
            this.loadedFrom = resultLoad.getLoadedFrom();
            this.exifOrientation = resultLoad.getExifOrientation();
            bitmapTransformResult = resultLoad.getBitmap();
            if (bitmapTransformResult == null) {
                Source source = resultLoad.getSource();
                try {
                    Bitmap bitmapDecodeStream = decodeStream(source, this.data);
                    try {
                        source.close();
                    } catch (IOException unused) {
                    }
                    bitmapTransformResult = bitmapDecodeStream;
                } catch (Throwable th2) {
                    try {
                        source.close();
                    } catch (IOException unused2) {
                    }
                    throw th2;
                }
            }
        }
        if (bitmapTransformResult != null) {
            if (this.picasso.loggingEnabled) {
                Utils.log(Utils.OWNER_HUNTER, Utils.VERB_DECODED, this.data.logId());
            }
            this.stats.dispatchBitmapDecoded(bitmapTransformResult);
            if (this.data.needsTransformation() || this.exifOrientation != 0) {
                synchronized (DECODE_LOCK) {
                    if (this.data.needsMatrixTransform() || this.exifOrientation != 0) {
                        bitmapTransformResult = transformResult(this.data, bitmapTransformResult, this.exifOrientation);
                        if (this.picasso.loggingEnabled) {
                            Utils.log(Utils.OWNER_HUNTER, Utils.VERB_TRANSFORMED, this.data.logId());
                        }
                    }
                    if (this.data.hasCustomTransformations()) {
                        bitmapTransformResult = applyCustomTransformations(this.data.transformations, bitmapTransformResult);
                        if (this.picasso.loggingEnabled) {
                            Utils.log(Utils.OWNER_HUNTER, Utils.VERB_TRANSFORMED, this.data.logId(), "from custom transformations");
                        }
                    }
                }
                if (bitmapTransformResult != null) {
                    this.stats.dispatchBitmapTransformed(bitmapTransformResult);
                }
            }
        }
        return bitmapTransformResult;
    }

    public boolean isCancelled() {
        Future<?> future = this.future;
        return future != null && future.isCancelled();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    updateThreadName(this.data);
                    if (this.picasso.loggingEnabled) {
                        Utils.log(Utils.OWNER_HUNTER, Utils.VERB_EXECUTING, Utils.getLogIdsForHunter(this));
                    }
                    Bitmap bitmapHunt = hunt();
                    this.result = bitmapHunt;
                    if (bitmapHunt == null) {
                        this.dispatcher.dispatchFailed(this);
                    } else {
                        this.dispatcher.dispatchComplete(this);
                    }
                } catch (Exception e10) {
                    this.exception = e10;
                    this.dispatcher.dispatchFailed(this);
                } catch (OutOfMemoryError e11) {
                    StringWriter stringWriter = new StringWriter();
                    this.stats.createSnapshot().dump(new PrintWriter(stringWriter));
                    this.exception = new RuntimeException(stringWriter.toString(), e11);
                    this.dispatcher.dispatchFailed(this);
                }
            } catch (NetworkRequestHandler.ResponseException e12) {
                if (!NetworkPolicy.isOfflineOnly(e12.networkPolicy) || e12.code != 504) {
                    this.exception = e12;
                }
                this.dispatcher.dispatchFailed(this);
            } catch (IOException e13) {
                this.exception = e13;
                this.dispatcher.dispatchRetry(this);
            }
        } finally {
            Thread.currentThread().setName(Utils.THREAD_IDLE_NAME);
        }
    }

    public boolean shouldRetry(boolean z10, NetworkInfo networkInfo) {
        int i10 = this.retryCount;
        if (!(i10 > 0)) {
            return false;
        }
        this.retryCount = i10 - 1;
        return this.requestHandler.shouldRetry(z10, networkInfo);
    }

    public boolean supportsReplay() {
        return this.requestHandler.supportsReplay();
    }

    public BitmapHunter(Picasso picasso, Dispatcher dispatcher, Cache cache, Stats stats, Action action, RequestHandler requestHandler) {
        this.picasso = picasso;
        this.dispatcher = dispatcher;
        this.cache = cache;
        this.stats = stats;
        this.action = action;
        this.key = action.getKey();
        this.data = action.getRequest();
        this.priority = action.getPriority();
        this.memoryPolicy = action.getMemoryPolicy();
        this.networkPolicy = action.getNetworkPolicy();
        this.requestHandler = requestHandler;
        this.retryCount = requestHandler.getRetryCount();
    }

    public static Bitmap applyCustomTransformations(List<Transformation> list, Bitmap bitmap) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            final Transformation transformation = list.get(i10);
            try {
                Bitmap bitmapTransform = transformation.transform(bitmap);
                if (bitmapTransform == null) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Transformation ");
                    sb2.append(transformation.key());
                    sb2.append(" returned null after ");
                    sb2.append(i10);
                    sb2.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator<Transformation> it = list.iterator();
                    while (it.hasNext()) {
                        sb2.append(it.next().key());
                        sb2.append('\n');
                    }
                    Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.BitmapHunter.4
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new NullPointerException(sb2.toString());
                        }
                    });
                    return null;
                }
                if (bitmapTransform == bitmap && bitmap.isRecycled()) {
                    Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.BitmapHunter.5
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new IllegalStateException("Transformation " + transformation.key() + " returned input Bitmap but recycled it.");
                        }
                    });
                    return null;
                }
                if (bitmapTransform != bitmap && !bitmap.isRecycled()) {
                    Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.BitmapHunter.6
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new IllegalStateException("Transformation " + transformation.key() + " mutated input Bitmap but failed to recycle the original.");
                        }
                    });
                    return null;
                }
                i10++;
                bitmap = bitmapTransform;
            } catch (RuntimeException e10) {
                Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.BitmapHunter.3
                    @Override // java.lang.Runnable
                    public void run() {
                        throw new RuntimeException("Transformation " + transformation.key() + " crashed with exception.", e10);
                    }
                });
                return null;
            }
        }
        return bitmap;
    }

    public static Bitmap decodeStream(Source source, Request request) throws IOException {
        BufferedSource bufferedSourceBuffer = Okio.buffer(source);
        boolean zIsWebPFile = Utils.isWebPFile(bufferedSourceBuffer);
        boolean z10 = request.purgeable;
        BitmapFactory.Options optionsCreateBitmapOptions = RequestHandler.createBitmapOptions(request);
        boolean zRequiresInSampleSize = RequestHandler.requiresInSampleSize(optionsCreateBitmapOptions);
        if (!zIsWebPFile) {
            InputStream inputStream = bufferedSourceBuffer.inputStream();
            if (zRequiresInSampleSize) {
                MarkableInputStream markableInputStream = new MarkableInputStream(inputStream);
                markableInputStream.allowMarksToExpire(false);
                long jSavePosition = markableInputStream.savePosition(1024);
                BitmapFactory.decodeStream(markableInputStream, null, optionsCreateBitmapOptions);
                RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, optionsCreateBitmapOptions, request);
                markableInputStream.reset(jSavePosition);
                markableInputStream.allowMarksToExpire(true);
                inputStream = markableInputStream;
            }
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, optionsCreateBitmapOptions);
            if (bitmapDecodeStream != null) {
                return bitmapDecodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        byte[] byteArray = bufferedSourceBuffer.readByteArray();
        if (zRequiresInSampleSize) {
            BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, optionsCreateBitmapOptions);
            RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, optionsCreateBitmapOptions, request);
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, optionsCreateBitmapOptions);
    }

    public static BitmapHunter forRequest(Picasso picasso, Dispatcher dispatcher, Cache cache, Stats stats, Action action) {
        Request request = action.getRequest();
        List<RequestHandler> requestHandlers = picasso.getRequestHandlers();
        int size = requestHandlers.size();
        for (int i10 = 0; i10 < size; i10++) {
            RequestHandler requestHandler = requestHandlers.get(i10);
            if (requestHandler.canHandleRequest(request)) {
                return new BitmapHunter(picasso, dispatcher, cache, stats, action, requestHandler);
            }
        }
        return new BitmapHunter(picasso, dispatcher, cache, stats, action, ERRORING_HANDLER);
    }

    public static void updateThreadName(Request request) {
        String name = request.getName();
        StringBuilder sb2 = NAME_BUILDER.get();
        sb2.ensureCapacity(name.length() + 8);
        sb2.replace(8, sb2.length(), name);
        Thread.currentThread().setName(sb2.toString());
    }
}
