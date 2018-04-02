package com.google.android.exoplayer2.audio;


public interface PSTSAudioProcessor extends AudioProcessor {

  /**
   * Sets the playback pitch. The new pitch will take effect after a call to {@link #flush()}.
   *
   * @param pitch The requested new pitch.
   * @return The actual new pitch.
   */
  float setPitch(float pitch);

  /**
   * Sets the playback speed. The new speed will take effect after a call to {@link #flush()}.
   *
   * @param speed The requested new playback speed.
   * @return The actual new playback speed.
   */
  float setSpeed(float speed);

  /**
   * Returns the specified duration scaled to take into account the speedup factor of this instance,
   * in the same units as {@code duration}.
   *
   * @param duration The duration to scale taking into account speedup.
   * @return The specified duration scaled to take into account speedup, in the same units as {@code duration}.
   */
  long scaleDurationForSpeedup(long duration);
}
