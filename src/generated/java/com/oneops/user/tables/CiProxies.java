/*
 * This file is generated by jOOQ.
 */
package com.oneops.user.tables;

import com.oneops.user.*;
import com.oneops.user.tables.records.CiProxiesRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.*;

/** This class is generated by jOOQ. */
@Generated(
  value = {"http://www.jooq.org", "jOOQ version:3.9.2"},
  comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class CiProxies extends TableImpl<CiProxiesRecord> {

  private static final long serialVersionUID = 2088283216;

  /** The reference instance of <code>public.ci_proxies</code> */
  public static final CiProxies CI_PROXIES = new CiProxies();

  /** The class holding records for this type */
  @Override
  public Class<CiProxiesRecord> getRecordType() {
    return CiProxiesRecord.class;
  }

  /** The column <code>public.ci_proxies.id</code>. */
  public final TableField<CiProxiesRecord, Integer> ID =
      createField(
          "id",
          org.jooq.impl.SQLDataType.INTEGER
              .nullable(false)
              .defaultValue(
                  org.jooq.impl.DSL.field(
                      "nextval('ci_proxies_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)),
          this,
          "");

  /** The column <code>public.ci_proxies.organization_id</code>. */
  public final TableField<CiProxiesRecord, Integer> ORGANIZATION_ID =
      createField("organization_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

  /** The column <code>public.ci_proxies.ci_id</code>. */
  public final TableField<CiProxiesRecord, Integer> CI_ID =
      createField("ci_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

  /** The column <code>public.ci_proxies.ci_name</code>. */
  public final TableField<CiProxiesRecord, String> CI_NAME =
      createField(
          "ci_name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

  /** The column <code>public.ci_proxies.ns_path</code>. */
  public final TableField<CiProxiesRecord, String> NS_PATH =
      createField(
          "ns_path", org.jooq.impl.SQLDataType.VARCHAR.length(250).nullable(false), this, "");

  /** The column <code>public.ci_proxies.created_at</code>. */
  public final TableField<CiProxiesRecord, Timestamp> CREATED_AT =
      createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

  /** The column <code>public.ci_proxies.updated_at</code>. */
  public final TableField<CiProxiesRecord, Timestamp> UPDATED_AT =
      createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

  /** The column <code>public.ci_proxies.ci_class_name</code>. */
  public final TableField<CiProxiesRecord, String> CI_CLASS_NAME =
      createField(
          "ci_class_name",
          org.jooq.impl.SQLDataType.VARCHAR
              .length(100)
              .nullable(false)
              .defaultValue(
                  org.jooq.impl.DSL.field(
                      "''::character varying", org.jooq.impl.SQLDataType.VARCHAR)),
          this,
          "");

  /** Create a <code>public.ci_proxies</code> table reference */
  public CiProxies() {
    this("ci_proxies", null);
  }

  /** Create an aliased <code>public.ci_proxies</code> table reference */
  public CiProxies(String alias) {
    this(alias, CI_PROXIES);
  }

  private CiProxies(String alias, Table<CiProxiesRecord> aliased) {
    this(alias, aliased, null);
  }

  private CiProxies(String alias, Table<CiProxiesRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, "");
  }

  /** {@inheritDoc} */
  @Override
  public Schema getSchema() {
    return Public.PUBLIC;
  }

  /** {@inheritDoc} */
  @Override
  public Identity<CiProxiesRecord, Integer> getIdentity() {
    return Keys.IDENTITY_CI_PROXIES;
  }

  /** {@inheritDoc} */
  @Override
  public UniqueKey<CiProxiesRecord> getPrimaryKey() {
    return Keys.CI_PROXIES_PKEY;
  }

  /** {@inheritDoc} */
  @Override
  public List<UniqueKey<CiProxiesRecord>> getKeys() {
    return Arrays.<UniqueKey<CiProxiesRecord>>asList(Keys.CI_PROXIES_PKEY);
  }

  /** {@inheritDoc} */
  @Override
  public CiProxies as(String alias) {
    return new CiProxies(alias, this);
  }

  /** Rename this table */
  @Override
  public CiProxies rename(String name) {
    return new CiProxies(name, null);
  }
}
