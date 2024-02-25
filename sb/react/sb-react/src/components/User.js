import React from 'react'

function User(props) {
    console.log(props);
    return (
        <div>User
            <div>İsim: {props.name}</div>
            <div>Şehir: {props.city}</div>
            <div>Plaka Şehir: {props.plate}</div>
            <hr />
        </div>
    )
}

export default User