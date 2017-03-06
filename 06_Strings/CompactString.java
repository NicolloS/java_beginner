/**
 * <p>Compact String.</p>
 *
 * <p>The current implementation of the <code>String</code> class stores characters
 * in a char array, using two bytes (sixteen bits) for each character (UFT-16).
 * Data gathered from many different applications indicates that strings are a major
 * component of heap usage and, moreover, that most <code>String</code> objects
 * contain only Latin-1 characters. Such characters require only one byte of storage,
 * hence half of the space in the internal char arrays of such String objects is
 * going unused.</p>
 * 
 * <p>So, lets implement a version of <code>String</code> that uses less space to
 * store the data. Get creative!</p>
 */

