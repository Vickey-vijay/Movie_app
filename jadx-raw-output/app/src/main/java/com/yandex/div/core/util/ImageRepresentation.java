package com.yandex.div.core.util;

import ck.p;

/* JADX INFO: compiled from: ImageRepresentation.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface ImageRepresentation {

    /* JADX INFO: compiled from: ImageRepresentation.kt */
    public static final class Bitmap implements ImageRepresentation {
        private final android.graphics.Bitmap value;

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Bitmap m3306boximpl(android.graphics.Bitmap bitmap) {
            return new Bitmap(bitmap);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static android.graphics.Bitmap m3307constructorimpl(android.graphics.Bitmap bitmap) {
            return bitmap;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3308equalsimpl(android.graphics.Bitmap bitmap, Object obj) {
            return (obj instanceof Bitmap) && p.e(bitmap, ((Bitmap) obj).m3311unboximpl());
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3309hashCodeimpl(android.graphics.Bitmap bitmap) {
            return bitmap.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3310toStringimpl(android.graphics.Bitmap bitmap) {
            return "Bitmap(value=" + bitmap + ')';
        }

        public boolean equals(Object obj) {
            return m3308equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m3309hashCodeimpl(this.value);
        }

        public String toString() {
            return m3310toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ android.graphics.Bitmap m3311unboximpl() {
            return this.value;
        }

        private /* synthetic */ Bitmap(android.graphics.Bitmap bitmap) {
            this.value = bitmap;
        }
    }

    /* JADX INFO: compiled from: ImageRepresentation.kt */
    public static final class PictureDrawable implements ImageRepresentation {
        private final android.graphics.drawable.PictureDrawable value;

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ PictureDrawable m3312boximpl(android.graphics.drawable.PictureDrawable pictureDrawable) {
            return new PictureDrawable(pictureDrawable);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static android.graphics.drawable.PictureDrawable m3313constructorimpl(android.graphics.drawable.PictureDrawable pictureDrawable) {
            return pictureDrawable;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3314equalsimpl(android.graphics.drawable.PictureDrawable pictureDrawable, Object obj) {
            return (obj instanceof PictureDrawable) && p.e(pictureDrawable, ((PictureDrawable) obj).m3317unboximpl());
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3315hashCodeimpl(android.graphics.drawable.PictureDrawable pictureDrawable) {
            return pictureDrawable.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3316toStringimpl(android.graphics.drawable.PictureDrawable pictureDrawable) {
            return "PictureDrawable(value=" + pictureDrawable + ')';
        }

        public boolean equals(Object obj) {
            return m3314equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m3315hashCodeimpl(this.value);
        }

        public String toString() {
            return m3316toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ android.graphics.drawable.PictureDrawable m3317unboximpl() {
            return this.value;
        }

        private /* synthetic */ PictureDrawable(android.graphics.drawable.PictureDrawable pictureDrawable) {
            this.value = pictureDrawable;
        }
    }
}
