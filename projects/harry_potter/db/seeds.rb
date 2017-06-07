require_relative('../models/student')
require_relative('../models/house')

# house1.destroy()
# house2.destroy()
# house3.destroy()
# house4.destroy()

# student1.destroy()
# student2.destroy()
# student3.destroy()
# student4.destroy()

house1 = House.new({'name' => 'Gryffindor'})
house2 = House.new({'name' => 'Hufflepuff'})
house3 = House.new({'name' => 'Ravenclaw'})
house4 = House.new({'name' => 'Slytherin'})

house1.save
house2.save
house3.save
house4.save

student1 = Student.new({
  'first_name' => 'Hermione', 
  'second_name' => 'Granger', 
  'house' => "Gryffindor", 
  'age' => 12,
  'pic' => "hermione.jpg" })
student2 = Student.new({
  'first_name' => 'Owen', 
  'second_name' => 'Cauldwell', 
  'house' => 'Hufflepuff', 
  'age' => 13,
  'pic' => 'magnum_pi.jpg' })
student3 = Student.new({
  'first_name' => 'Roger', 
  'second_name' => 'Davies', 
  'house' => 'Ravenclaw', 
  'age' => 14,
  'pic' => 'robocop.jpg' })
student4 = Student.new({
  'first_name' => 'Severus', 
  'second_name' => 'Snape', 
  'house' => 'Slytherin.jpg', 
  'age' => 37,
  'pic' => 'deirdre'})

student1.save
student2.save
student3.save
student4.save

Student.all
nil
