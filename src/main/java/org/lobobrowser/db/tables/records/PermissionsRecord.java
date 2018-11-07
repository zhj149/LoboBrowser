/**
 * This class is generated by jOOQ
 */
package org.lobobrowser.db.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.5.0"
    },
    comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PermissionsRecord extends org.jooq.impl.UpdatableRecordImpl<org.lobobrowser.db.tables.records.PermissionsRecord> implements
    org.jooq.Record3<String, String, Integer> {

  private static final long serialVersionUID = 457680487;

  /**
   * Setter for <code>PUBLIC.PERMISSIONS.FRAMEHOST</code>.
   */
  public void setFramehost(final String value) {
    setValue(0, value);
  }

  /**
   * Getter for <code>PUBLIC.PERMISSIONS.FRAMEHOST</code>.
   */
  public String getFramehost() {
    return (String) getValue(0);
  }

  /**
   * Setter for <code>PUBLIC.PERMISSIONS.REQUESTHOST</code>.
   */
  public void setRequesthost(final String value) {
    setValue(1, value);
  }

  /**
   * Getter for <code>PUBLIC.PERMISSIONS.REQUESTHOST</code>.
   */
  public String getRequesthost() {
    return (String) getValue(1);
  }

  /**
   * Setter for <code>PUBLIC.PERMISSIONS.PERMISSIONS</code>.
   */
  public void setPermissions(final Integer value) {
    setValue(2, value);
  }

  /**
   * Getter for <code>PUBLIC.PERMISSIONS.PERMISSIONS</code>.
   */
  public Integer getPermissions() {
    return (Integer) getValue(2);
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Record2<String, String> key() {
    return (org.jooq.Record2) super.key();
  }

  // -------------------------------------------------------------------------
  // Record3 type implementation
  // -------------------------------------------------------------------------

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Row3<String, String, Integer> fieldsRow() {
    return (org.jooq.Row3) super.fieldsRow();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Row3<String, String, Integer> valuesRow() {
    return (org.jooq.Row3) super.valuesRow();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Field<String> field1() {
    return org.lobobrowser.db.tables.Permissions.PERMISSIONS.FRAMEHOST;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Field<String> field2() {
    return org.lobobrowser.db.tables.Permissions.PERMISSIONS.REQUESTHOST;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Field<Integer> field3() {
    return org.lobobrowser.db.tables.Permissions.PERMISSIONS.PERMISSIONS_;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String value1() {
    return getFramehost();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String value2() {
    return getRequesthost();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Integer value3() {
    return getPermissions();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.lobobrowser.db.tables.records.PermissionsRecord value1(final String value) {
    setFramehost(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.lobobrowser.db.tables.records.PermissionsRecord value2(final String value) {
    setRequesthost(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.lobobrowser.db.tables.records.PermissionsRecord value3(final Integer value) {
    setPermissions(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.lobobrowser.db.tables.records.PermissionsRecord values(final String value1, final String value2, final Integer value3) {
    return this;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  /**
   * Create a detached PermissionsRecord
   */
  public PermissionsRecord() {
    super(org.lobobrowser.db.tables.Permissions.PERMISSIONS);
  }

  /**
   * Create a detached, initialised PermissionsRecord
   */
  public PermissionsRecord(final String framehost, final String requesthost, final Integer permissions) {
    super(org.lobobrowser.db.tables.Permissions.PERMISSIONS);

    setValue(0, framehost);
    setValue(1, requesthost);
    setValue(2, permissions);
  }
}