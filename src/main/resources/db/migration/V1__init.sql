CREATE SEQUENCE hibernate_sequence INCREMENT 1 MINVALUE 1;

CREATE TABLE revinfo
(
    rev      integer PRIMARY KEY,
    revtstmp bigint
);

create sequence revinfo_seq start with 1 increment by 50;

CREATE TABLE audited
(
    id      BIGSERIAL PRIMARY KEY,
    payload jsonb
);

CREATE TABLE audited_aud
(
    id      BIGSERIAL PRIMARY KEY,
    payload jsonb,
    revision_id        INT4                     NOT NULL,
    revision_type      SMALLINT                 NOT NULL
);