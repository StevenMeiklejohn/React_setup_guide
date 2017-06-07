require_relative( '../db/sql_runner' )
require_relative('./student')
require('pry-byebug')
class House

  attr_accessor( :id, :name )

  def initialize( options )
    @id = nil || options['id'].to_i
    @name = options['name']
  end

  def save()
    sql = "INSERT INTO houses (
      name
    ) VALUES (
      '#{ @name }'
    ) RETURNING *"
    house_data = SqlRunner.run(sql)
    @id = house_data.first()['id'].to_i
  end

  def self.all()
    sql = "SELECT * FROM houses"
    houses = SqlRunner.run( sql )
    result = houses.map { |house| House.new( house ) }
    return result
  end

  def self.find(id)
    sql = "SELECT * FROM houses WHERE id=#{id}"
    house = SqlRunner.run( sql )
    result = House.new( house.first )
    return result
  end

  def self.update( options )
    sql = "UPDATE houses SET
      name='#{ options['name'] }'
      WHERE id='#{ options['id'] }'"
    SqlRunner.run( sql )
  end

  def self.destroy( id )
    sql = "DELETE FROM houses WHERE id=#{ id }"
    SqlRunner.run( sql )
  end

  def students()
    sql = "SELECT * FROM students WHERE house = '#{ @name }'"
    students = SqlRunner.run(sql)
    result = students.map { |student| Student.new( student ) }
    return result
  end



end
