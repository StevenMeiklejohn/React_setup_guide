require( 'pry-byebug' )
require( 'sinatra' )
require( 'sinatra/contrib/all' )
require( 'json' )
require_relative( './models/student' )
require_relative( './models/house' )



get '/welcome' do
  erb( :welcome )
end

# get '/welcome/students' do
#   @students = Student.all()
#   erb( :students )
# end

get '/welcome/index' do
  @students = Student.all()
  erb( :index )
end

get '/welcome/index/:id' do
  @student = Student.find( params[:id] )
  erb( :show )
end

get '/welcome/index/:id/edit' do
  @student = Student.find( params[:id] )
  erb( :edit )
end

#actually update a pizza using its id
post '/welcome/index/:id' do
  @student = Student.update( params )
  redirect to( "/welcome/index/#{ params[:id] }" )
end


get '/welcome/index/:id/delete' do
  Student.destroy( params[:id] )
  erb( :show )
end

get '/welcome/houses_index' do
  erb( :houses_index )
end





get '/welcome/gryffindor' do
  @house = House.find(1)

  @students = @house.students()

  erb( :gryffindor )
end

get '/welcome/ravenclaw' do
  erb( :ravenclaw )
end

get '/welcome/slytherin' do
  erb( :slytherin )
end

get '/welcome/hufflepuff' do
  erb( :hufflepuff )
end

# get '/welcome/:choice1/:choice2' do
#   p1 = params[:choice1]
#   p2 = params[:choice2]
#   game_new = Game.new( p1, p2 ) 
#   @result = game_new.play()
#   erb( :result )
# end

# get '/welcome/paper/:choice2' do
#   p1 = params[:choice1]
#   p2 = params[:choice2]
#   game_new = Game.new( p1, p2 ) 
#   @result = game_new.play()
#   erb( :result )
# end

# get '/welcome/scissors/:choice2' do
#   p1 = params[:choice1]
#   p2 = params[:choice2]
#   game_new = Game.new( p1, p2 ) 
#   @result = game_new.play()
#   erb( :result )
# end
