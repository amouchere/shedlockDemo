create table shedlock (
  name       varchar(64)  not null primary key,
  lock_until timestamp null,
  locked_at  timestamp null,
  locked_by  varchar(255) null
)
  engine = InnoDB;

