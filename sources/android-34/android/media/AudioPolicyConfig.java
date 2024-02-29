/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.media;
/**
 * Audio policy configuration. Functionally replaces the APM XML file.
 * {@hide}
 */
public class AudioPolicyConfig implements android.os.Parcelable
{
  public android.media.AudioHwModule[] modules;
  public int[] supportedModes;
  public android.media.SurroundSoundConfig surroundSoundConfig;
  public android.media.audio.common.AudioHalEngineConfig engineConfig;
  public static final android.os.Parcelable.Creator<AudioPolicyConfig> CREATOR = new android.os.Parcelable.Creator<AudioPolicyConfig>() {
    @Override
    public AudioPolicyConfig createFromParcel(android.os.Parcel _aidl_source) {
      AudioPolicyConfig _aidl_out = new AudioPolicyConfig();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public AudioPolicyConfig[] newArray(int _aidl_size) {
      return new AudioPolicyConfig[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeTypedArray(modules, _aidl_flag);
    _aidl_parcel.writeIntArray(supportedModes);
    _aidl_parcel.writeTypedObject(surroundSoundConfig, _aidl_flag);
    _aidl_parcel.writeTypedObject(engineConfig, _aidl_flag);
    int _aidl_end_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.setDataPosition(_aidl_start_pos);
    _aidl_parcel.writeInt(_aidl_end_pos - _aidl_start_pos);
    _aidl_parcel.setDataPosition(_aidl_end_pos);
  }
  public final void readFromParcel(android.os.Parcel _aidl_parcel)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    int _aidl_parcelable_size = _aidl_parcel.readInt();
    try {
      if (_aidl_parcelable_size < 4) throw new android.os.BadParcelableException("Parcelable too small");;
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      modules = _aidl_parcel.createTypedArray(android.media.AudioHwModule.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      supportedModes = _aidl_parcel.createIntArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      surroundSoundConfig = _aidl_parcel.readTypedObject(android.media.SurroundSoundConfig.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      engineConfig = _aidl_parcel.readTypedObject(android.media.audio.common.AudioHalEngineConfig.CREATOR);
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(modules);
    _mask |= describeContents(surroundSoundConfig);
    _mask |= describeContents(engineConfig);
    return _mask;
  }
  private int describeContents(Object _v) {
    if (_v == null) return 0;
    if (_v instanceof Object[]) {
      int _mask = 0;
      for (Object o : (Object[]) _v) {
        _mask |= describeContents(o);
      }
      return _mask;
    }
    if (_v instanceof android.os.Parcelable) {
      return ((android.os.Parcelable) _v).describeContents();
    }
    return 0;
  }
}
