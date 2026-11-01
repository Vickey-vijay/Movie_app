package com.google.android.exoplayer2.audio;

import androidx.annotation.CallSuper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: BaseAudioProcessor.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AudioProcessor.a f19069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioProcessor.a f19070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AudioProcessor.a f19071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AudioProcessor.a f19072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f19073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f19074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f19075h;

    public abstract AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException;

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.f19075h = true;
        e();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        this.f19071d = aVar;
        this.f19072e = c(aVar);
        return isActive() ? this.f19072e : AudioProcessor.a.f18988e;
    }

    public final boolean b() {
        return this.f19074g.hasRemaining();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.f19074g = AudioProcessor.f18987a;
        this.f19075h = false;
        this.f19069b = this.f19071d;
        this.f19070c = this.f19072e;
        d();
    }

    public final ByteBuffer g(int i10) {
        if (this.f19073f.capacity() < i10) {
            this.f19073f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f19073f.clear();
        }
        ByteBuffer byteBuffer = this.f19073f;
        this.f19074g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @CallSuper
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f19074g;
        this.f19074g = AudioProcessor.f18987a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.f19072e != AudioProcessor.a.f18988e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @CallSuper
    public boolean isEnded() {
        return this.f19075h && this.f19074g == AudioProcessor.f18987a;
    }

    public c() {
        ByteBuffer byteBuffer = AudioProcessor.f18987a;
        this.f19073f = byteBuffer;
        this.f19074g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f18988e;
        this.f19071d = aVar;
        this.f19072e = aVar;
        this.f19069b = aVar;
        this.f19070c = aVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f19073f = AudioProcessor.f18987a;
        AudioProcessor.a aVar = AudioProcessor.a.f18988e;
        this.f19071d = aVar;
        this.f19072e = aVar;
        this.f19069b = aVar;
        this.f19070c = aVar;
        f();
    }
}
