package nextstep.subway.applicaion.station.domain;

import nextstep.subway.applicaion.domain.BaseEntity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Station extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true)
	private String name;

	protected Station() {
	}

	protected Station(String name) {
		this.name = name;
	}

	public static Station of(String name) {
		return new Station(name);
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Station station = (Station) o;
		return name.equals(station.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

}
