package p000do;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ho.k;
import ho.m;
import in.d;
import in.e;
import in.f;
import in.g;
import in.h;
import in.i;
import in.j;
import io.c;
import java.beans.PropertyChangeSupport;
import java.net.URI;
import org.eclipse.jetty.util.security.Constraint;
import org.fourthline.cling.model.types.b;
import org.fourthline.cling.support.avtransport.AVTransportException;
import org.fourthline.cling.support.avtransport.lastchange.AVTransportVariable;
import org.fourthline.cling.support.model.PlayMode;
import org.fourthline.cling.support.model.RecordMediumWriteStatus;
import org.fourthline.cling.support.model.RecordQualityMode;
import org.fourthline.cling.support.model.SeekMode;
import org.fourthline.cling.support.model.StorageMedium;
import org.fourthline.cling.support.model.TransportAction;
import org.fourthline.cling.support.model.TransportState;
import org.fourthline.cling.support.model.TransportStatus;

/* JADX INFO: compiled from: AbstractAVTransportService.java */
/* JADX INFO: loaded from: classes5.dex */
@g(serviceId = @h("AVTransport"), serviceType = @i(value = "AVTransport", version = 1), stringConvertibleTypes = {k.class})
@in.k({@j(allowedValuesEnum = TransportState.class, name = "TransportState", sendEvents = false), @j(allowedValuesEnum = TransportStatus.class, name = "TransportStatus", sendEvents = false), @j(allowedValuesEnum = StorageMedium.class, defaultValue = Constraint.NONE, name = "PlaybackStorageMedium", sendEvents = false), @j(allowedValuesEnum = StorageMedium.class, defaultValue = "NOT_IMPLEMENTED", name = "RecordStorageMedium", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, defaultValue = "NETWORK", name = "PossiblePlaybackStorageMedia", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, defaultValue = "NOT_IMPLEMENTED", name = "PossibleRecordStorageMedia", sendEvents = false), @j(allowedValuesEnum = PlayMode.class, defaultValue = "NORMAL", name = "CurrentPlayMode", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, defaultValue = "1", name = "TransportPlaySpeed", sendEvents = false), @j(allowedValuesEnum = RecordMediumWriteStatus.class, defaultValue = "NOT_IMPLEMENTED", name = "RecordMediumWriteStatus", sendEvents = false), @j(allowedValuesEnum = RecordQualityMode.class, defaultValue = "NOT_IMPLEMENTED", name = "CurrentRecordQualityMode", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, defaultValue = "NOT_IMPLEMENTED", name = "PossibleRecordQualityModes", sendEvents = false), @j(datatype = "ui4", defaultValue = "0", name = "NumberOfTracks", sendEvents = false), @j(datatype = "ui4", defaultValue = "0", name = "CurrentTrack", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, name = "CurrentTrackDuration", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, defaultValue = "00:00:00", name = "CurrentMediaDuration", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, defaultValue = "NOT_IMPLEMENTED", name = "CurrentTrackMetaData", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, name = "CurrentTrackURI", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, name = "AVTransportURI", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, defaultValue = "NOT_IMPLEMENTED", name = "AVTransportURIMetaData", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, defaultValue = "NOT_IMPLEMENTED", name = "NextAVTransportURI", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, defaultValue = "NOT_IMPLEMENTED", name = "NextAVTransportURIMetaData", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, name = "RelativeTimePosition", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, name = "AbsoluteTimePosition", sendEvents = false), @j(datatype = "i4", defaultValue = "2147483647", name = "RelativeCounterPosition", sendEvents = false), @j(datatype = "i4", defaultValue = "2147483647", name = "AbsoluteCounterPosition", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, name = "CurrentTransportActions", sendEvents = false), @j(allowedValuesEnum = SeekMode.class, name = "A_ARG_TYPE_SeekMode", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, name = "A_ARG_TYPE_SeekTarget", sendEvents = false), @j(datatype = "ui4", name = "A_ARG_TYPE_InstanceID", sendEvents = false)})
public abstract class a implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PropertyChangeSupport f52241b = new PropertyChangeSupport(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @j(eventMaximumRateMilliseconds = 200)
    public final k f52240a = new k(new fo.a());

    public abstract TransportAction[] c(b bVar) throws Exception;

    @d(out = {@f(getterName = "getPlayMediaString", name = "PlayMedia", stateVariable = "PossiblePlaybackStorageMedia"), @f(getterName = "getRecMediaString", name = "RecMedia", stateVariable = "PossibleRecordStorageMedia"), @f(getterName = "getRecQualityModesString", name = "RecQualityModes", stateVariable = "PossibleRecordQualityModes")})
    public abstract io.b d(@e(name = "InstanceID") b bVar) throws AVTransportException;

    @d(out = {@f(getterName = "getNumberOfTracks", name = "NrTracks", stateVariable = "NumberOfTracks"), @f(getterName = "getMediaDuration", name = "MediaDuration", stateVariable = "CurrentMediaDuration"), @f(getterName = "getCurrentURI", name = "CurrentURI", stateVariable = "AVTransportURI"), @f(getterName = "getCurrentURIMetaData", name = "CurrentURIMetaData", stateVariable = "AVTransportURIMetaData"), @f(getterName = "getNextURI", name = "NextURI", stateVariable = "NextAVTransportURI"), @f(getterName = "getNextURIMetaData", name = "NextURIMetaData", stateVariable = "NextAVTransportURIMetaData"), @f(getterName = "getPlayMedium", name = "PlayMedium", stateVariable = "PlaybackStorageMedium"), @f(getterName = "getRecordMedium", name = "RecordMedium", stateVariable = "RecordStorageMedium"), @f(getterName = "getWriteStatus", name = "WriteStatus", stateVariable = "RecordMediumWriteStatus")})
    public abstract c e(@e(name = "InstanceID") b bVar) throws AVTransportException;

    @d(out = {@f(getterName = "getTrack", name = "Track", stateVariable = "CurrentTrack"), @f(getterName = "getTrackDuration", name = "TrackDuration", stateVariable = "CurrentTrackDuration"), @f(getterName = "getTrackMetaData", name = "TrackMetaData", stateVariable = "CurrentTrackMetaData"), @f(getterName = "getTrackURI", name = "TrackURI", stateVariable = "CurrentTrackURI"), @f(getterName = "getRelTime", name = "RelTime", stateVariable = "RelativeTimePosition"), @f(getterName = "getAbsTime", name = "AbsTime", stateVariable = "AbsoluteTimePosition"), @f(getterName = "getRelCount", name = "RelCount", stateVariable = "RelativeCounterPosition"), @f(getterName = "getAbsCount", name = "AbsCount", stateVariable = "AbsoluteCounterPosition")})
    public abstract io.d f(@e(name = "InstanceID") b bVar) throws AVTransportException;

    @d(out = {@f(getterName = "getCurrentTransportState", name = "CurrentTransportState", stateVariable = "TransportState"), @f(getterName = "getCurrentTransportStatus", name = "CurrentTransportStatus", stateVariable = "TransportStatus"), @f(getterName = "getCurrentSpeed", name = "CurrentSpeed", stateVariable = "TransportPlaySpeed")})
    public abstract io.f g(@e(name = "InstanceID") b bVar) throws AVTransportException;

    @d(out = {@f(getterName = "getPlayMode", name = "PlayMode", stateVariable = "CurrentPlayMode"), @f(getterName = "getRecQualityMode", name = "RecQualityMode", stateVariable = "CurrentRecordQualityMode")})
    public abstract io.g h(@e(name = "InstanceID") b bVar) throws AVTransportException;

    @Override // ho.m
    public void b(k kVar, b bVar) throws Exception {
        c cVarE = e(bVar);
        io.f fVarG = g(bVar);
        io.g gVarH = h(bVar);
        io.d dVarF = f(bVar);
        io.b bVarD = d(bVar);
        kVar.a(bVar, new AVTransportVariable.a(URI.create(cVarE.a())), new AVTransportVariable.b(cVarE.b()), new AVTransportVariable.e(cVarE.c()), new AVTransportVariable.f(gVarH.a()), new AVTransportVariable.g(gVarH.b()), new AVTransportVariable.h(dVarF.c()), new AVTransportVariable.i(dVarF.d()), new AVTransportVariable.j(dVarF.g()), new AVTransportVariable.k(URI.create(dVarF.h())), new AVTransportVariable.l(c(bVar)), new AVTransportVariable.m(URI.create(cVarE.d())), new AVTransportVariable.n(cVarE.e()), new AVTransportVariable.o(cVarE.f()), new AVTransportVariable.p(bVarD.a()), new AVTransportVariable.q(bVarD.c()), new AVTransportVariable.r(bVarD.b()), new AVTransportVariable.s(cVarE.h()), new AVTransportVariable.t(cVarE.g()), new AVTransportVariable.w(fVarG.a()), new AVTransportVariable.x(fVarG.b()), new AVTransportVariable.y(fVarG.c()));
    }
}
