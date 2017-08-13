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
   * Returns the number of bytes of input queued since the last call to {@link #flush()}.
   */
  long getInputByteCount();

  /**
   * Returns the number of bytes of output dequeued since the last call to {@link #flush()}.
   */
  long getOutputByteCount();
}
