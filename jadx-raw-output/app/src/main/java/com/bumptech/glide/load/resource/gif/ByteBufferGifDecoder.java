package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Glide;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.gifdecoder.GifHeader;
import com.bumptech.glide.gifdecoder.GifHeaderParser;
import com.bumptech.glide.gifdecoder.StandardGifDecoder;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.UnitTransformation;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import com.ironsource.C3426d4;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes6.dex */
public class ByteBufferGifDecoder implements ResourceDecoder<ByteBuffer, GifDrawable> {
    private static final GifDecoderFactory GIF_DECODER_FACTORY = new GifDecoderFactory();
    private static final GifHeaderParserPool PARSER_POOL = new GifHeaderParserPool();
    private static final String TAG = "BufferGifDecoder";
    private final Context context;
    private final GifDecoderFactory gifDecoderFactory;
    private final GifHeaderParserPool parserPool;
    private final List<ImageHeaderParser> parsers;
    private final GifBitmapProvider provider;

    @VisibleForTesting
    public static class GifDecoderFactory {
        public GifDecoder build(GifDecoder.BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer, int i10) {
            return new StandardGifDecoder(bitmapProvider, gifHeader, byteBuffer, i10);
        }
    }

    @VisibleForTesting
    public static class GifHeaderParserPool {
        private final Queue<GifHeaderParser> pool = Util.createQueue(0);

        public synchronized GifHeaderParser obtain(ByteBuffer byteBuffer) {
            GifHeaderParser gifHeaderParserPoll;
            gifHeaderParserPoll = this.pool.poll();
            if (gifHeaderParserPoll == null) {
                gifHeaderParserPoll = new GifHeaderParser();
            }
            return gifHeaderParserPoll.setData(byteBuffer);
        }

        public synchronized void release(GifHeaderParser gifHeaderParser) {
            gifHeaderParser.clear();
            this.pool.offer(gifHeaderParser);
        }
    }

    public ByteBufferGifDecoder(Context context) {
        this(context, Glide.get(context).getRegistry().getImageHeaderParsers(), Glide.get(context).getBitmapPool(), Glide.get(context).getArrayPool());
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public GifDrawableResource decode(@NonNull ByteBuffer byteBuffer, int i10, int i11, @NonNull Options options) {
        GifHeaderParser gifHeaderParserObtain = this.parserPool.obtain(byteBuffer);
        try {
            return decode(byteBuffer, i10, i11, gifHeaderParserObtain, options);
        } finally {
            this.parserPool.release(gifHeaderParserObtain);
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull ByteBuffer byteBuffer, @NonNull Options options) throws IOException {
        return !((Boolean) options.get(GifOptions.DISABLE_ANIMATION)).booleanValue() && ImageHeaderParserUtils.getType(this.parsers, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    private static int getSampleSize(GifHeader gifHeader, int i10, int i11) {
        int iHighestOneBit;
        int iMin = Math.min(gifHeader.getHeight() / i11, gifHeader.getWidth() / i10);
        if (iMin == 0) {
            iHighestOneBit = 0;
        } else {
            iHighestOneBit = Integer.highestOneBit(iMin);
        }
        int iMax = Math.max(1, iHighestOneBit);
        if (Log.isLoggable(TAG, 2) && iMax > 1) {
            Log.v(TAG, "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i10 + VastAttributes.HORIZONTAL_POSITION + i11 + "], actual dimens: [" + gifHeader.getWidth() + VastAttributes.HORIZONTAL_POSITION + gifHeader.getHeight() + C3426d4.j.f28588e);
        }
        return iMax;
    }

    public ByteBufferGifDecoder(Context context, List<ImageHeaderParser> list, BitmapPool bitmapPool, ArrayPool arrayPool) {
        this(context, list, bitmapPool, arrayPool, PARSER_POOL, GIF_DECODER_FACTORY);
    }

    @Nullable
    private GifDrawableResource decode(ByteBuffer byteBuffer, int i10, int i11, GifHeaderParser gifHeaderParser, Options options) {
        Bitmap.Config config;
        long logTime = LogTime.getLogTime();
        try {
            GifHeader header = gifHeaderParser.parseHeader();
            if (header.getNumFrames() > 0 && header.getStatus() == 0) {
                if (options.get(GifOptions.DECODE_FORMAT) == DecodeFormat.PREFER_RGB_565) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                GifDecoder gifDecoderBuild = this.gifDecoderFactory.build(this.provider, header, byteBuffer, getSampleSize(header, i10, i11));
                gifDecoderBuild.setDefaultBitmapConfig(config);
                gifDecoderBuild.advance();
                Bitmap nextFrame = gifDecoderBuild.getNextFrame();
                if (nextFrame == null) {
                    return null;
                }
                return new GifDrawableResource(new GifDrawable(this.context, gifDecoderBuild, UnitTransformation.get(), i10, i11, nextFrame));
            }
            return null;
        } finally {
            if (Log.isLoggable(TAG, 2)) {
                Log.v(TAG, "Decoded GIF from stream in " + LogTime.getElapsedMillis(logTime));
            }
        }
    }

    @VisibleForTesting
    public ByteBufferGifDecoder(Context context, List<ImageHeaderParser> list, BitmapPool bitmapPool, ArrayPool arrayPool, GifHeaderParserPool gifHeaderParserPool, GifDecoderFactory gifDecoderFactory) {
        this.context = context.getApplicationContext();
        this.parsers = list;
        this.gifDecoderFactory = gifDecoderFactory;
        this.provider = new GifBitmapProvider(bitmapPool, arrayPool);
        this.parserPool = gifHeaderParserPool;
    }
}
