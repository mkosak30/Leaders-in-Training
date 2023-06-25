Imports System

Public Class LeadersInTraining
    Private _name As String
    Private _age As Integer
    Private _role As String

    Public Sub New(ByVal name As String, ByVal age As Integer, ByVal role As String)
        _name = name
        _age = age
        _role = role
    End Sub

    Public Property Name As String
        Get
            Return _name
        End Get
        Set(value As String)
            _name = value
        End Set
    End Property

    Public Property Age As Integer
        Get
            Return _age
        End Get
        Set(value As Integer)
            _age = value
        End Set
    End Property

    Public Property Role As String
        Get
            Return _role
        End Get
        Set(value As String)
            _role = value
        End Set
    End Property

    Public Function GetFullInfoString() As String
        Return String.Format("{0} is {1} years old and is a {2}", _name, _age, _role)
    End Function
End Class

Module Program
    Sub Main()
        Dim leaders() As LeadersInTraining = { _
            New LeadersInTraining("John Smith", 25, "Team Leader"), _
            New LeadersInTraining("Jane Doe", 23, "Junior Leader"), _
            New LeadersInTraining("Bob Jones", 24, "Trainee Leader") _
        }

        Console.WriteLine("Leaders in Training:")
        Dim index As Integer = 0
        For Each leader As LeadersInTraining In leaders
            Console.WriteLine("{0}. {1}", index, leader.GetFullInfoString())
            index += 1
        Next

        Console.WriteLine("")
        Console.WriteLine("Press any key to continue...")
        Console.ReadKey(True)
    End Sub
End Module