package org.multibit.hd.hardware.core.events;

/**
 * <p>Enum to provide the following to application:</p>
 * <ul>
 * <li>Identification of high level events for downstream consumers</li>
 * </ul>
 *
 * <p>A high level event provides sufficient information for a downstream
 * consumer to present appropriate information to the user and handle the
 * subsequent response. They allow the hardware wallet to make assumptions
 * about what is being shown on the user interface.</p>
 *
 * <p>These high level messages are considered to be common
 * across all hardware wallets supported through MultiBit Hardware.</p>
 *
 * @since 0.0.1
 *  
 */
public enum HardwareWalletEventType {

  // Device connectivity and communication
  /**
   * Indicates there is a problem with the hardware wallet.
   */
  SHOW_DEVICE_FAILED,

  /**
   * Indicates that a device is ready to be used.
   * The service will provide more details about wallet creation being necessary and so on.
   */
  SHOW_DEVICE_READY,

  /**
   * Indicates that a device is detached.
   */
  SHOW_DEVICE_DETACHED,

  /**
   * The UI should show a message informing the user that the device requires a button press.
   */
  SHOW_BUTTON_PRESS,

  /**
   * The UI should show a dialog asking the user to enter a word from their seed phrase.
   */
  SHOW_WORD_ENTRY,

  /**
   * The UI should show a dialog asking the user to enter their PIN (possibly using an obfuscated matrix technique).
   */
  SHOW_PIN_ENTRY,

  // End of enum
  ;


}